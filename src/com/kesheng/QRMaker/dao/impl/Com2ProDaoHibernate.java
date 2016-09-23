package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.Com2ProDao;
import com.kesheng.QRMaker.domain.Com2Pro;
import com.kesheng.QRMaker.domain.Company;

public class Com2ProDaoHibernate extends HibernateDaoSupport implements Com2ProDao {

	@Override
	public Integer save(Com2Pro com2pro) {
		// TODO Auto-generated method stub
		return (Integer) getHibernateTemplate().save(com2pro);
	}

	@Override
	public void update(Com2Pro com2pro) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(com2pro);
	}

	@Override
	public void delete(Com2Pro com2pro) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(com2pro);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Com2Pro> findAll() {
		// TODO Auto-generated method stub
		return (List<Com2Pro>)getHibernateTemplate().find("from Com2Pro");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Com2Pro> findByCom(Company company) {
		// TODO Auto-generated method stub
		return (List<Com2Pro>)getHibernateTemplate().find("from Com2Pro where company_id=?",company.getId());
	}

}
