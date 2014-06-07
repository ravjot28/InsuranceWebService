package com.rav.insurance.useroperations.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.useroperations.bean.UserBean;
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

	public boolean findUserName(String userName) {
		String password = getPasswordByUserId(userName);

		if (password != null && password.trim().length() > 0)
			return true;

		return false;
	}

	
	public String getPasswordByUserId(String userName) {
		String password = null;
		UserBean bean = getUserBean(userName);
		if(bean !=null ){
			password = bean.getPassword();
		}
		return password;
	}

	@SuppressWarnings("unchecked")
	public UserBean getUserBean(String userName) {
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

			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}
}
