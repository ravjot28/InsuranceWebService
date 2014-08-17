package com.rav.insurance.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

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

	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

}