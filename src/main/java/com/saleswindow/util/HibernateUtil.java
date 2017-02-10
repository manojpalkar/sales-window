package com.saleswindow.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (Exception exception) {
			System.err.println("Session Factory could not be created." + exception);
			throw new ExceptionInInitializerError(exception);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
