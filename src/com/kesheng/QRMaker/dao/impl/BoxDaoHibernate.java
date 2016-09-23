package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.BoxDao;
import com.kesheng.QRMaker.domain.Box;

public class BoxDaoHibernate extends HibernateDaoSupport  implements BoxDao {

	@Override
	public Box get(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Box.class, id);
	}

	@Override
	public Integer save(Box box) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(box);
	}

	@Override
	public void update(Box box) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(box);
	}

	@Override
	public void delete(Box box) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(box);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Box> findAll() {
		// TODO Auto-generated method stub
		return (List<Box>)getHibernateTemplate().find("from Company");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Box> findById(String id) {
		// TODO Auto-generated method stub
		return (List<Box>)getHibernateTemplate().find("from Company where ID=?",id);
	}

}
