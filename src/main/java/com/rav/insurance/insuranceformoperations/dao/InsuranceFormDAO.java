package com.rav.insurance.insuranceformoperations.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
import com.rav.insurance.insuranceformoperations.model.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.DatabaseConfig;

public class InsuranceFormDAO {

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

			session = DatabaseConfig.getSessionFactory().openSession();
			session.beginTransaction();
			InsuranceFormBean bean = (InsuranceFormBean) session.get(
					InsuranceFormBean.class, formId);
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
	public List<AbstractFormInfo> getFormList(String role, String userName,
			String status, String businessName, int formId, int month)
			throws Exception {
		Session session;
		List<AbstractFormInfo> finalList = null;

		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(InsuranceFormBean.class);

		
			if (!CommonValidations.isStringEmpty(userName)
					&& !CommonValidations.isStringEmpty(role)) {
				if (role.equals("MARKETER")) {
					crit.add(Restrictions.eq("marketerUserName", userName));
				} else if (role.equals("PRODUCER")) {
					crit.add(Restrictions.eq("producerUserName", userName));
				}
			}

			if (!CommonValidations.isStringEmpty(status))
				crit.add(Restrictions.eq("status", status));

			if (!CommonValidations.isStringEmpty(businessName))
				crit.add(Restrictions.eq("businessName", businessName));

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

}
