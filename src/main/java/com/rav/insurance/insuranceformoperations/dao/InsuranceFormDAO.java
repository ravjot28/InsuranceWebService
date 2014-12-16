package com.rav.insurance.insuranceformoperations.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.DozerBeanMapper;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import com.rav.insurance.insuranceformoperations.bean.CloseFormBean;
import com.rav.insurance.insuranceformoperations.bean.DelayMails;
import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
import com.rav.insurance.insuranceformoperations.bean.MailRepoBean;
import com.rav.insurance.insuranceformoperations.bean.MessageInfo;
import com.rav.insurance.insuranceformoperations.bean.MessageNew;
import com.rav.insurance.insuranceformoperations.bean.QuoteDetailsBean;
import com.rav.insurance.insuranceformoperations.model.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.model.EditFormSubmissionRequest;
import com.rav.insurance.insuranceformoperations.model.GetCloseFormNQuoteDetailsResponse;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.model.PostFormMailRequest;
import com.rav.insurance.insuranceformoperations.model.QuoteDetailsRequest;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.DatabaseConfig;
import com.rav.insurance.util.WriteByteArray;

public class InsuranceFormDAO {

	public void insertMailRepo(String formId, String emailAddress)
			throws Exception {

		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();
			session.beginTransaction();
			MailRepoBean bean = new MailRepoBean();
			bean.setFormId(formId);
			bean.setRecepients(emailAddress);

			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	public String getEmailAddress(String formId) throws Exception {
		Session session;
		String email = null;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();
			session.beginTransaction();

			Criteria crit = session.createCriteria(MailRepoBean.class);
			crit.add(Restrictions.ge("formId", formId));
			List<MailRepoBean> list = (List<MailRepoBean>) crit.list();
			if (list != null && list.size() > 0) {
				email = list.get(0).getRecepients();
			}
		} catch (Exception e) {
			throw e;
		}
		return email;
	}

	@SuppressWarnings("unchecked")
	public GetCloseFormNQuoteDetailsResponse getCloseFormNQuoteDetails(
			String formId) throws Exception {
		Session session;
		GetCloseFormNQuoteDetailsResponse response = new GetCloseFormNQuoteDetailsResponse();
		try {

			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(QuoteDetailsBean.class);

			crit.add(Restrictions.eq("formId", formId));

			List<QuoteDetailsBean> list = (List<QuoteDetailsBean>) crit.list();
			if (list != null && list.size() > 0) {
				QuoteDetailsBean qdb = list.get(0);
				response.setCompanyname1(qdb.getCompanyname1());
				response.setCompanyname2(qdb.getCompanyname2());
				response.setCompanyname3(qdb.getCompanyname3());
				response.setCompanyname4(qdb.getCompanyname4());
				response.setCompanyname5(qdb.getCompanyname5());
				response.setCompanyname6(qdb.getCompanyname6());
				response.setCompanyname7(qdb.getCompanyname7());
				response.setCompanyname8(qdb.getCompanyname8());
				response.setCompanyname9(qdb.getCompanyname9());
				response.setCompanyname10(qdb.getCompanyname10());

				response.setQuote1(qdb.getQuote1());
				response.setQuote2(qdb.getQuote2());
				response.setQuote3(qdb.getQuote3());
				response.setQuote4(qdb.getQuote4());
				response.setQuote5(qdb.getQuote5());
				response.setQuote6(qdb.getQuote6());
				response.setQuote7(qdb.getQuote7());
				response.setQuote8(qdb.getQuote8());
				response.setQuote9(qdb.getQuote9());
				response.setQuote10(qdb.getQuote10());

				response.setComment1(qdb.getComment1());
				response.setComment2(qdb.getComment2());
				response.setComment3(qdb.getComment3());
				response.setComment4(qdb.getComment4());
				response.setComment5(qdb.getComment5());
				response.setComment6(qdb.getComment6());
				response.setComment7(qdb.getComment7());
				response.setComment8(qdb.getComment8());
				response.setComment9(qdb.getComment9());
				response.setComment10(qdb.getComment10());
			}

			crit = session.createCriteria(CloseFormBean.class);

			crit.add(Restrictions.eq("formId", formId));

			List<CloseFormBean> list1 = (List<CloseFormBean>) crit.list();
			if (list1 != null && list1.size() > 0) {
				CloseFormBean cfb = list1.get(0);
				response.setQuote(cfb.getQuote());
				response.setBusinessWithUs(cfb.getBusinessWithUs());
				response.setCompany(cfb.getCompany());
			}

			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}

		return response;
	}

	public void insertCloseFormInformation(CloseFormBean bean) throws Exception {
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			session.save(bean);

			InsuranceFormBean b = (InsuranceFormBean) session.get(
					InsuranceFormBean.class,
					Integer.parseInt(bean.getFormId().replaceAll("UCCIG", "")));
			b.setStatus("CLOSE");
			b.setWithUs(bean.getBusinessWithUs());
			session.getTransaction().commit();

		} catch (Exception e) {
			throw e;
		}
	}

	public void insertQuoteDetails(QuoteDetailsBean bean) throws Exception {
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
	}

	public int submitForm(InsuranceFormBean bean) throws Exception {
		Session session = null;
		int formId = -1;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(bean);
			formId = bean.getId();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			for (Throwable ex = e; ex != null; ex = e.getCause())
				ex.printStackTrace();
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw e;
		}

		return formId;
	}

	public boolean assignMarketer(int formId, String marketerUserName)
			throws Exception {
		boolean result = false;

		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			InsuranceFormBean bean = (InsuranceFormBean) session.get(
					InsuranceFormBean.class, formId);
			if (!CommonValidations.isStringEmpty(bean.getMarketerUserName())
					&& !bean.getMarketerUserName().equals("Not Assigned")) {
				throw new Exception("Form ID UCCIG" + formId
						+ " is already assigned to "
						+ bean.getMarketerUserName());
			}
			bean.setMarketerUserName(marketerUserName);
			bean.setStatus("ASSIGNED");
			session.getTransaction().commit();
			result=true;
		} catch (Exception e) {
			throw e;
		}

		return result;
	}

	public GetInsuranceFormResponse getForm(int formId) throws Exception {
		GetInsuranceFormResponse form = null;
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			InsuranceFormBean bean = (InsuranceFormBean) session.get(
					InsuranceFormBean.class, formId);

			form = new GetInsuranceFormResponse();

			DozerBeanMapper mapper = new DozerBeanMapper();
			mapper.map(bean, form);
			form.setFormId("" + bean.getId());

			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}

		return form;
	}

	@SuppressWarnings("unchecked")
	public List<QuoteDetailsRequest> getQuoteDetails(Date creationDate,
			String companyName, String marketerId) {
		Session session;
		List<QuoteDetailsRequest> finalList = null;
		try {
			List<AbstractFormInfo> list = getFormList(null, marketerId, null,
					null, -1, -1, null, creationDate);
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();
			finalList = new ArrayList<QuoteDetailsRequest>();
			for (AbstractFormInfo a : list) {

				Criteria crit = session.createCriteria(QuoteDetailsBean.class);
				crit.add(Restrictions.eq("formId", "UCCIG" + a.getFormId()));
				List<QuoteDetailsBean> b = (List<QuoteDetailsBean>) crit.list();
				if (b != null && b.size() > 0) {
					String businessWithUs = null;
					double quote = 0;
					String company = null;

					Criteria crit1 = session
							.createCriteria(CloseFormBean.class);
					crit1.add(Restrictions.eq("formId", "UCCIG" + a.getFormId()));
					List<CloseFormBean> c = (List<CloseFormBean>) crit1.list();
					if (c != null && c.size() > 0) {
						businessWithUs = c.get(0).getBusinessWithUs();
						quote = c.get(0).getQuote();
						company = c.get(0).getCompany();
					}

					if (b.get(0).getCompanyname1().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname1());
						request.setComment1(b.get(0).getComment1());
						request.setQuote1(b.get(0).getQuote1());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname2().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname2());
						request.setComment1(b.get(0).getComment2());
						request.setQuote1(b.get(0).getQuote2());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname3().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname3());
						request.setComment1(b.get(0).getComment3());
						request.setQuote1(b.get(0).getQuote3());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname4().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname4());
						request.setComment1(b.get(0).getComment4());
						request.setQuote1(b.get(0).getQuote4());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname5().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname5());
						request.setComment1(b.get(0).getComment5());
						request.setQuote1(b.get(0).getQuote5());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname6().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname6());
						request.setComment1(b.get(0).getComment6());
						request.setQuote1(b.get(0).getQuote6());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname7().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname7());
						request.setComment1(b.get(0).getComment7());
						request.setQuote1(b.get(0).getQuote7());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname8().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname8());
						request.setComment1(b.get(0).getComment8());
						request.setQuote1(b.get(0).getQuote8());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname9().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname9());
						request.setComment1(b.get(0).getComment9());
						request.setQuote1(b.get(0).getQuote9());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

					if (b.get(0).getCompanyname10().equals(companyName)) {
						QuoteDetailsRequest request = new QuoteDetailsRequest();
						request.setCompanyname1(b.get(0).getCompanyname10());
						request.setComment1(b.get(0).getComment10());
						request.setQuote1(b.get(0).getQuote10());
						request.setFormId("UCCIG" + a.getFormId());
						request.setBusinessWithUs(businessWithUs);
						request.setCompany(company);
						request.setQuote(quote);
						request.setMarketerId(a.getMarketerId());
						request.setBusinessName(a.getBusinessName());
						finalList.add(request);
					}

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finalList;
	}

	@SuppressWarnings("unchecked")
	public List<AbstractFormInfo> getFormList(String producerId,
			String marketerId, String status, String businessName, int formId,
			int month, String withUs, Date creationDate) throws Exception {
		Session session;
		List<AbstractFormInfo> finalList = null;

		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(InsuranceFormBean.class);

			if (!CommonValidations.isStringEmpty(producerId)) {
				crit.add(Restrictions.eq("producer", producerId).ignoreCase());
			} else if (!CommonValidations.isStringEmpty(marketerId)) {
				crit.add(Restrictions.eq("marketerUserName", marketerId).ignoreCase());
			}

			if (!CommonValidations.isStringEmpty(status)){
				String[] s = status.split(",");
				if(s.length ==2)
					crit.add(Restrictions.or(Restrictions.eq("status", s[0]),
							Restrictions.eq("status", s[1])));
				if(s.length==1)
					crit.add(Restrictions.eq("status", s[0]));
				
			}

			if (!CommonValidations.isStringEmpty(businessName))
			{
				System.out.println(businessName);
				crit.add(Restrictions.like("businessName", "%"+businessName+"%").ignoreCase());	
			}

			if (!CommonValidations.isStringEmpty(withUs))
				crit.add(Restrictions.eq("withUs", withUs));

			if (formId > 0)
				crit.add(Restrictions.eq("id", formId));

			if (month > 0) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MONTH, (-1 * month));
				Date date = cal.getTime();
				crit.add(Restrictions.ge("creationDate", date));

			}

			if (creationDate != null)
				crit.add(Restrictions.ge("creationDate", creationDate));
			crit.addOrder(Order.desc("id"));
			List<InsuranceFormBean> list = (List<InsuranceFormBean>) crit
					.list();
			if (list != null && list.size() > 0) {
				finalList = new ArrayList<AbstractFormInfo>();

				for (InsuranceFormBean form : list) {
					AbstractFormInfo formInfo = new AbstractFormInfo();
					formInfo.setFormId("" + form.getId());
					formInfo.setMarketerId(form.getMarketerUserName());
					formInfo.setProducerId(form.getProducer());
					formInfo.setStatus(form.getStatus());
					formInfo.setBranch(form.getBranch());
					formInfo.setBusinessName(form.getBusinessName());
					formInfo.setCreationDate(form.getCreationDate());
					formInfo.setSeverity(form.getSeverity());
					formInfo.setWithUs(form.getWithUs());
					formInfo.setInsuranceType(form.getType());
					finalList.add(formInfo);
				}
			}

			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}

		return finalList;
	}

	public void insertDelayMail(PostFormMailRequest request) throws Exception {
		DelayMails mail = new DelayMails();
		mail.setFormId(request.getFormId());
		mail.setFrom1(request.getFrom());
		mail.setRecepients(request.getRecpients());
		mail.setSentDate(getZeroTimeDate(request.getSendDate()));
		mail.setSubject(request.getSubject());

		Session session = null;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(mail);
			WriteByteArray.writeByteArray(mail.getId().toString(),
					request.getMessage());
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			for (Throwable ex = e; ex != null; ex = e.getCause())
				ex.printStackTrace();
			if (session != null) {
				session.getTransaction().rollback();
			}
			throw e;
		}
	}

	public static Date getZeroTimeDate(Date fecha) {
		Date res = fecha;
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fecha);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		res = calendar.getTime();

		return res;
	}

	public void updateForm(EditFormSubmissionRequest model) throws Exception {
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();
			System.out.println("gvghvhg "+model.getFormId());
			
			InsuranceFormBean bean = (InsuranceFormBean) session
					.get(InsuranceFormBean.class,
							Integer.parseInt(model.getFormId().replaceAll(
									"UCCIG", "")));
			System.out.println("gvghvhg "+model.getFormId());
			String status = "NEW";
			String marketerUserName = null;
			if(bean.getMarketerUserName()!=null){
				marketerUserName = bean.getMarketerUserName();
			}
			if(bean.getStatus()!=null){
				status = bean.getStatus();
			}
			DozerBeanMapper mapper = new DozerBeanMapper();
			mapper.map(model, bean);
			bean.setId(Integer.parseInt(model.getFormId().replaceAll(
									"UCCIG", "")));
			
			bean.setStatus(status);
			bean.setMarketerUserName(marketerUserName);

			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Long getMailId(String subject,Date sentDate,String recepients) throws Exception {
	Session session;
	String email = null;
	try {
	session = DatabaseConfig.getSessionFactory().openSession();
	session.beginTransaction();

	Criteria crit = session.createCriteria(MessageInfo.class);
	crit.add(Restrictions.eq("subject", subject));
	crit.add(Restrictions.eq("sentDate", sentDate));
	crit.add(Restrictions.eq("recepients", recepients));

	List<MessageInfo> list = (List<MessageInfo>) crit.list();
	if (list != null && list.size() > 0) {
	return list.get(0).getId();
	}
	} catch (Exception e) {
	throw e;
	}
	return (long) -1;
	}
			

	@SuppressWarnings("unchecked")
	public List<MessageNew> searchMail(String formId) throws Exception {
		List<MessageNew> list = null;
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();
			Criteria c = session.createCriteria(MessageInfo.class);
			ProjectionList pl = Projections.projectionList();
			pl.add(Projections.distinct(Projections.property("receivedDate")),"receivedDate");
			pl.add(Projections.property("sentDate"),"sentDate");
			pl.add(Projections.property("from1"),"from1");
			pl.add(Projections.property("recepients"),"recepients");
			pl.add(Projections.property("subject"),"subject");
			c.setProjection(pl);
			c.setResultTransformer(Transformers.aliasToBean(MessageNew.class));
			
			list = c.list();
			System.out.println("List1"+list.get(0));
			System.out.println("List 2"+ list.get(1));
			System.out.println("List 3" +list.get(2));
			System.out.println("List 3" +list.get(3));
			
			session.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
