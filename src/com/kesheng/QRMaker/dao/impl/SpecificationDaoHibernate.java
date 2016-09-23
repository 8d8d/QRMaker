package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.SpecificationDao;
import com.kesheng.QRMaker.domain.ProductType;
import com.kesheng.QRMaker.domain.Specification;

public class SpecificationDaoHibernate extends HibernateDaoSupport implements SpecificationDao {

	@Override
	public Specification get(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Specification.class, id);
	}

	@Override
	public Integer save(Specification specification) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(specification);
	}

	@Override
	public void update(Specification specification) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(specification);
	}

	@Override
	public void delete(Specification specification) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(specification);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specification> findAll() {
		// TODO Auto-generated method stub
		return (List<Specification>)getHibernateTemplate().find("from Specification");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specification> findByProType(ProductType producttype) {
		// TODO Auto-generated method stub
		return (List<Specification>)getHibernateTemplate().find("from Specification where specification_id=?",producttype.getSpecification().getId());
	}

}
