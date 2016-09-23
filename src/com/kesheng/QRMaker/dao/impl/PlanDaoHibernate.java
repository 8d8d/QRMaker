package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.*;
import com.kesheng.QRMaker.domain.*;

public class PlanDaoHibernate extends HibernateDaoSupport implements PlanDao {
	public Plan get(int id) {
		return getHibernateTemplate().get(Plan.class, id);
	}
	
	public Integer save(Plan plan) {
		return (Integer)getHibernateTemplate().save(plan);
	}
	
	public void update(Plan plan) {
		getHibernateTemplate().save(plan);
	}
	
	public void delete(Plan plan) {
		getHibernateTemplate().delete(plan);
	}
	
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<Plan> findAll() {
		return (List<Plan>)getHibernateTemplate().find("from Plan");
	}
	
}
