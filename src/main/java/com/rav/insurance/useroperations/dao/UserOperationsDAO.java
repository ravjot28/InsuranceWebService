package com.rav.insurance.useroperations.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.useroperations.bean.UserBean;
import com.rav.insurance.useroperations.bean.UserDetails;
import com.rav.insurance.util.DatabaseConfig;

public class UserOperationsDAO {

	public void registerUser(UserBean bean) throws Exception {
		Session session = null;

		try {
			session = DatabaseConfig.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(bean);
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

	public boolean findUserName(String userName, String emailAddress)
			throws Exception {
		String password = getPasswordByUserId(userName, emailAddress);

		if (password != null && password.trim().length() > 0)
			return true;

		return false;
	}

	public String getPasswordByUserId(String userName, String emailAddress)
			throws Exception {
		String password = null;
		UserBean bean = getUserBean(userName, emailAddress, false);
		if (bean != null) {
			password = bean.getPassword();
		}
		return password;
	}

	@SuppressWarnings("unchecked")
	public void updatePassword(String userName, String password)
			throws Exception {
		UserBean bean = null;
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(UserBean.class);

			Criterion activeRestriction = Restrictions.eq("active",
					CommonConstants.ACTIVE);

			Criterion userNameRestriction = Restrictions.eq("userName",
					userName);

			LogicalExpression andExp = Restrictions.and(userNameRestriction,
					activeRestriction);

			crit.add(andExp);

			List<UserBean> userList = ((List<UserBean>) crit.list());

			if (userList != null && userList.size() > 0) {
				bean = userList.get(0);

			}

			bean.setPassword(password);
			bean.setUpdatedDate(new Date());
			session.save(bean);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	public UserBean getUserBean(String userName, String emailAddress,
			boolean isLogin) throws Exception {
		UserBean bean = null;
		Session session;
		try {
			session = DatabaseConfig.getSessionFactory().openSession();

			session.beginTransaction();

			Criteria crit = session.createCriteria(UserBean.class);

			Criterion activeRestriction = Restrictions.eq("active",
					CommonConstants.ACTIVE);

			Criterion userNameRestriction = null;
			Criterion emailAddressRestriction = null;
			if (userName != null) {
				userNameRestriction = Restrictions.eq("userName", userName);
			}
			if (emailAddress != null) {
				emailAddressRestriction = Restrictions.eq("emailAddress",
						emailAddress);
			}
			LogicalExpression andExp = null;
			if (emailAddressRestriction != null && userNameRestriction != null) {
				LogicalExpression andExp1 = Restrictions.and(
						emailAddressRestriction, userNameRestriction);

				andExp = Restrictions.and(andExp1, activeRestriction);
			} else if (emailAddressRestriction != null) {
				andExp = Restrictions.and(emailAddressRestriction,
						activeRestriction);
			} else {
				andExp = Restrictions.and(userNameRestriction,
						activeRestriction);
			}

			crit.add(andExp);

			List<UserBean> userList = ((List<UserBean>) crit.list());

			if (userList != null && userList.size() > 0) {
				bean = userList.get(0);
				if (isLogin) {
					crit = session.createCriteria(UserDetails.class);

					emailAddressRestriction = Restrictions.eq("emailAddress",
							bean.getEmailAddress());

					crit.add(emailAddressRestriction);

					List<UserDetails> userDetailsList = ((List<UserDetails>) crit
							.list());

					if (userDetailsList != null && userDetailsList.size() > 0) {
						String role = userDetailsList.get(0).getRole();
						bean.setRole(role);
						bean.setBranch(userDetailsList.get(0).getBranch());
					}
				}

			}

			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}
		return bean;
	}
}
