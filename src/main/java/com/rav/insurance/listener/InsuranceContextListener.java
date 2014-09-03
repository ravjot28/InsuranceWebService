package com.rav.insurance.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.Session;

import com.rav.insurance.useroperations.bean.UserDetails;
import com.rav.insurance.util.DatabaseConfig;

/**
 * Application Lifecycle Listener implementation class FamedenContextListener
 * 
 */
@WebListener
public class InsuranceContextListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public InsuranceContextListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent context) {

		System.setProperty("emailTemplates", context.getServletContext()
				.getRealPath("/WEB-INF/classes/com/rav/emailformats"));
		System.out.println("Inserting");
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();
			UserDetails bean = new UserDetails();
			bean.setBranch("Kingston");
			bean.setEmailAddress("harmansingh1699@gmail.com");
			bean.setRole("MANAGER");
			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {
		
		}

	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

}