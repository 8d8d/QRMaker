package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.*;
import com.kesheng.QRMaker.domain.*;

public class ProductDaoHibernate extends HibernateDaoSupport implements ProductDao {
	public Product get(int id) {
		return getHibernateTemplate().get(Product.class, id);
	}

	@Override
	public Integer save(Product product) {
		// TODO Auto-generated method stub
		return (Integer) getHibernateTemplate().save(product);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(product);
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(product);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>)getHibernateTemplate().find("from Product");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findByProType(ProductType producttype) {
		// TODO Auto-generated method stub
		return (List<Product>)getHibernateTemplate().find("from Product where TYPE_ID=?",producttype.getId());
	}

}
