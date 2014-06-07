package com.rav.insurance.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.useroperations.constants.UserOperationsConstants;

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
		System.setProperty(
				CommonConstants.PRIVATE_RSA_KEY,
				context.getServletContext().getRealPath(
						CommonConstants.PRIVATE_RSA_KEY_PATH));

		System.setProperty(
				CommonConstants.PUBLIC_RSA_KEY,
				context.getServletContext().getRealPath(
						CommonConstants.PUBLIC_RSA_KEY_PATH));

		System.setProperty(
				UserOperationsConstants.EMAIL_TEMPLATES_PROPERTY,
				context.getServletContext().getRealPath(
						UserOperationsConstants.EMAIL_TEMPLATES_PATH));
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

}
