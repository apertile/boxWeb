package com.arielpertile.boxWeb.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arielpertile.boxWeb.model.Boxer;

@Named
@Repository
public class BoxerDaoImpl extends AbstractDao implements BoxerDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Override
	public Boxer findById(int boxerId) {
		Criteria criteria = getSession().createCriteria(Boxer.class);
		criteria.add(Restrictions.eq("id",boxerId));
		return (Boxer) criteria.uniqueResult();
	}
	
	@Override
	public List<Boxer> findAll() {
		Criteria criteria = getSession().createCriteria(Boxer.class);
		@SuppressWarnings("unchecked")
		List<Boxer> list = (List<Boxer>) criteria.list();
		return list;
	}
	
	@Override
	public Boxer findBySurnameAndFirstName(String surname, String firstName) {
		
		Query query = getSession().getNamedQuery(Boxer.GET_BOXER).setString("surname", surname).setString("firstName", firstName);
		Boxer customer = (Boxer) query.uniqueResult();
		return customer;
	}
	


}
