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

	@SuppressWarnings("unchecked")
	private String getPasswordByUserId(String userName) {
		String password = null;
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
				password = userList.get(0).getPassword();

			}

			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}
}
