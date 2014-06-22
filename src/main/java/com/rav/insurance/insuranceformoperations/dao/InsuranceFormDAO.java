package com.rav.insurance.insuranceformoperations.dao;

import org.hibernate.Session;

import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
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

}
