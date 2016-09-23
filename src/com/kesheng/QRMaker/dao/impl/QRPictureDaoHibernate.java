package com.kesheng.QRMaker.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kesheng.QRMaker.dao.*;
import com.kesheng.QRMaker.domain.*;

public class QRPictureDaoHibernate extends HibernateDaoSupport implements QRPictureDao {
	public QRPicture get(int id) {
		return getHibernateTemplate().get(QRPicture.class, id);
	}
	
	public Integer save(QRPicture qrpicture) {
		return (Integer)getHibernateTemplate().save(qrpicture);
	}
	
	public void update(QRPicture qrpicture) {
		getHibernateTemplate().save(qrpicture);
	}
	
	public void delete(QRPicture qrpicture) {
		getHibernateTemplate().delete(qrpicture);
	}
	
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<QRPicture> findAll() {
		return (List<QRPicture>)getHibernateTemplate().find("from QRPicture");
	}

}
