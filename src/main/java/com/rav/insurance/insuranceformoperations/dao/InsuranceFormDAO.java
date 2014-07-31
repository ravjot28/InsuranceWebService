package com.rav.insurance.insuranceformoperations.dao;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
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

	@SuppressWarnings("unchecked")
	public GetInsuranceFormResponse getForm(int formId) throws Exception {
		GetInsuranceFormResponse form = null;
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();
			Criteria crit = session.createCriteria(InsuranceFormBean.class);
			Criterion restriction = Restrictions.eq("id", formId);

			crit.add(restriction);

			List<InsuranceFormBean> list = (List<InsuranceFormBean>) crit
					.list();
			if (list != null && list.size() > 0) {
				InsuranceFormBean bean = list.get(0);
				
				form = new GetInsuranceFormResponse();
				
				DozerBeanMapper mapper = new DozerBeanMapper();
				mapper.map(bean, form);
				form.setFormId(""+bean.getId());
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}

		return form;
	}

	@SuppressWarnings("unchecked")
	public List<AbstractFormInfo> getFormList(String role, String userName)
			throws Exception {
		Session session;
		List<AbstractFormInfo> finalList = null;
		if (!CommonValidations.isStringEmpty(role)) {
			try {
				session = DatabaseConfig.getSessionFactory().openSession();

				session.beginTransaction();
				Criteria crit = session.createCriteria(InsuranceFormBean.class);
				Criterion restriction = null;
				if (role.equals("PRODUCER")) {
					restriction = Restrictions.eq("producerUserName", userName);
				} else if (role.equals("MARKETER")) {
					restriction = Restrictions.eq("marketerUserName", userName);
				} else if (role.equals("MANAGER")) {
					restriction = Restrictions.eq("status", "NEW");
				}

				crit.add(restriction);

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
		}

		return finalList;
	}

}
