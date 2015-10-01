package com.arielpertile.boxWeb.dao;

import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public abstract class AbstractDao {

	@Inject
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object entity) {
		getSession().persist(entity);
	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}
}
