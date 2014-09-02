package com.rav.insurance.insuranceformoperations.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.rav.insurance.insuranceformoperations.bean.CloseFormBean;
import com.rav.insurance.insuranceformoperations.bean.DelayMails;
import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
import com.rav.insurance.insuranceformoperations.bean.MessageInfo;
import com.rav.insurance.insuranceformoperations.bean.QuoteDetailsBean;
import com.rav.insurance.insuranceformoperations.model.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.model.EditFormSubmissionRequest;
import com.rav.insurance.insuranceformoperations.model.GetCloseFormNQuoteDetailsResponse;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.model.PostFormMailRequest;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.DatabaseConfig;
import com.rav.insurance.util.WriteByteArray;

public class InsuranceFormDAO {

	@SuppressWarnings("unchecked")
	public GetCloseFormNQuoteDetailsResponse getCloseFormNQuoteDetails(
			String formId) throws Exception {
		Session session;
		GetCloseFormNQuoteDetailsResponse response = new GetCloseFormNQuoteDetailsResponse();
		try {

			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(QuoteDetailsBean.class);

			crit.add(Restrictions.ge("formId", formId));

			List<QuoteDetailsBean> list = (List<QuoteDetailsBean>) crit.list();
			if (list != null && list.size() > 0) {
				QuoteDetailsBean qdb = list.get(0);
				response.setAbex(qdb.getAbex());
				response.setAmFredericks(qdb.getAmFredericks());
				response.setApril(qdb.getApril());
				response.setAviva(qdb.getAviva());
				response.setBurnsnWilcox(qdb.getBurnsnWilcox());
				response.setCfc(qdb.getCfc());
				response.setChutter(qdb.getChutter());
				response.setcNA(qdb.getcNA());
				response.setCreechurch(qdb.getCreechurch());
				response.setDominion(qdb.getDominion());
				response.setEcclesiastical(qdb.getEcclesiastical());
				response.setEncon(qdb.getEncon());
				response.setGore(qdb.getGore());
				response.setGroupOne(qdb.getGroupOne());
				response.setIntact(qdb.getIntact());
				response.setLloyds(qdb.getLloyds());
				response.setNorthbridge(qdb.getNorthbridge());
				response.setPremierMarine(qdb.getPremierMarine());
				response.setrSA(qdb.getrSA());
				response.setSouthWestern(qdb.getSouthWestern());
				response.setsRIM(qdb.getsRIM());
				response.setsUM(qdb.getsUM());
				response.settCIM(qdb.gettCIM());
				response.setTotte(qdb.getTotte());
				response.setZurich(qdb.getZurich());
			}

			crit = session.createCriteria(CloseFormBean.class);

			crit.add(Restrictions.ge("formId", formId));

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
			session.getTransaction().commit();
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
	public List<AbstractFormInfo> getFormList(String producerId,
			String marketerId, String status, String businessName, int formId,
			int month,String withUs) throws Exception {
		Session session;
		List<AbstractFormInfo> finalList = null;

		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(InsuranceFormBean.class);

			if (!CommonValidations.isStringEmpty(producerId)) {
				crit.add(Restrictions.eq("producerUserName", producerId));
			} else if (!CommonValidations.isStringEmpty(marketerId)) {
				crit.add(Restrictions.eq("marketerUserName", marketerId));
			}

			if (!CommonValidations.isStringEmpty(status))
				crit.add(Restrictions.eq("status", status));

			if (!CommonValidations.isStringEmpty(businessName))
				crit.add(Restrictions.eq("businessName", businessName));
			
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

			List<InsuranceFormBean> list = (List<InsuranceFormBean>) crit
					.list();
			if (list != null && list.size() > 0) {
				finalList = new ArrayList<AbstractFormInfo>();

				for (InsuranceFormBean form : list) {
					AbstractFormInfo formInfo = new AbstractFormInfo();
					formInfo.setFormId("" + form.getId());
					formInfo.setMarketerId(form.getMarketerUserName());
					formInfo.setProducerId(form.getProducerUserName());
					formInfo.setStatus(form.getStatus());
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

			InsuranceFormBean bean = (InsuranceFormBean) session
					.get(InsuranceFormBean.class,
							Integer.parseInt(model.getFormId().replaceAll(
									"UCCIG", "")));
			DozerBeanMapper mapper = new DozerBeanMapper();
			mapper.map(model, bean);
			bean.setStatus("NEW");

			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	public List<MessageInfo> searchMail(String formId) throws Exception {
		List<MessageInfo> list = null;
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();
			Query queryObject = session
					.createQuery("from MessageInfo where subject like '%'||"
							+ formId + "||'%'");
			list = (List<MessageInfo>) queryObject.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

}
