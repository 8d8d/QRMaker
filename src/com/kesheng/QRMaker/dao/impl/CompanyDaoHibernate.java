package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.*;
import com.kesheng.QRMaker.domain.Company;

public class CompanyDaoHibernate extends HibernateDaoSupport implements CompanyDao {
	public Company get(int id){
		return getHibernateTemplate().get(Company.class, id);
	}
	
	public Integer save(Company company){
		return (Integer)getHibernateTemplate().save(company);
	}
	
	public void update(Company company){
		getHibernateTemplate().save(company);
	}
	
	public void delete(Company company){
		getHibernateTemplate().delete(company);
	}
	
	public void delete(int id){
		getHibernateTemplate().delete(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> findAll(){
		return (List<Company>)getHibernateTemplate().find("from Company");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findById(int id) {
		// TODO Auto-generated method stub
		return (List<Company>)getHibernateTemplate().find("from Company where id=?",id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findByAdmin(String admin) {
		// TODO Auto-generated method stub
		System.out.println("DaoImpl");
		return (List<Company>)getHibernateTemplate().find("from Company where admin=?",admin);
	}

}
