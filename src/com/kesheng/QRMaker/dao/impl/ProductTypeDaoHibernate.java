package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.ProductTypeDao;
import com.kesheng.QRMaker.domain.ProductType;

public class ProductTypeDaoHibernate extends HibernateDaoSupport implements ProductTypeDao {

	@Override
	public ProductType get(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(ProductType.class, id);
	}

	@Override
	public Integer save(ProductType producttype) {
		// TODO Auto-generated method stub
		return (Integer) getHibernateTemplate().save(producttype);
	}

	@Override
	public void update(ProductType producttype) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(producttype);
	}

	@Override
	public void delete(ProductType producttype) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(producttype);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductType> findAll() {
		// TODO Auto-generated method stub
		return (List<ProductType>)getHibernateTemplate().find("from ProductType");
	}

}
