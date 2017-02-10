package com.saleswindow.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.saleswindow.dao.UserDao;
import com.saleswindow.entity.UserDetailsEntity;
import com.saleswindow.util.HibernateUtil;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public List<UserDetailsEntity> getUserDetails() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<UserDetailsEntity> userDetailsList = (List<UserDetailsEntity>) session
				.createQuery("From UserDetailsEntity").list();

		session.getTransaction().commit();
		session.close();

		return userDetailsList;

	}

}
