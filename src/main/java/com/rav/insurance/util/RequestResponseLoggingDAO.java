package com.rav.insurance.util;

import org.hibernate.Session;

import com.rav.insurance.log.bean.RequestResponseLoggingBean;

public class RequestResponseLoggingDAO {

	public static void log(RequestResponseLoggingBean bean) {
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {

		}
	}

}
