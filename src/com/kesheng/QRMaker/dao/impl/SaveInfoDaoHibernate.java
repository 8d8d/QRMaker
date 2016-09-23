package com.kesheng.QRMaker.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.SaveInfoDao;
import com.kesheng.QRMaker.domain.SaveInfo;

public class SaveInfoDaoHibernate extends HibernateDaoSupport implements SaveInfoDao {

	@Override
	public SaveInfo get(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(SaveInfo.class, id);
	}

	@Override
	public Integer save(SaveInfo saveinfo) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(saveinfo);
	}

	@Override
	public void update(SaveInfo saveinfo) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(saveinfo);
	}

	@Override
	public void delete(SaveInfo saveinfo) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(saveinfo);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id));
	}

}
