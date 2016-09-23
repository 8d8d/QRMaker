package com.kesheng.QRMaker.service.impl;

import com.kesheng.QRMaker.dao.*;
import com.kesheng.QRMaker.domain.*;
import com.kesheng.QRMaker.service.*;

public class UserImpl implements User{
	//private static Company company;
	private BoxDao boxDao;
	private Com2Pro com2pro;
	private SaveInfo saveinfo;
	private Specification specification;
	private CompanyDao companyDao;
	private ProductDao productDao;
	private PlanDao planDao;
	private QRPictureDao qrpictureDao;

	public BoxDao getBoxDao() {
		return boxDao;
	}

	public Com2Pro getCom2pro() {
		return com2pro;
	}

	public SaveInfo getSaveinfo() {
		return saveinfo;
	}

	public Specification getSpecification() {
		return specification;
	}

	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public PlanDao getPlanDao() {
		return planDao;
	}

	public QRPictureDao getQrpictureDao() {
		return qrpictureDao;
	}

	public void setBoxDao(BoxDao boxDao) {
		this.boxDao = boxDao;
	}

	public void setCom2pro(Com2Pro com2pro) {
		this.com2pro = com2pro;
	}

	public void setSaveinfo(SaveInfo saveinfo) {
		this.saveinfo = saveinfo;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void setPlanDao(PlanDao planDao) {
		this.planDao = planDao;
	}

	public void setQrpictureDao(QRPictureDao qrpictureDao) {
		this.qrpictureDao = qrpictureDao;
	}

	public int Register(Company company){
		if(companyDao.findById(company.getId()).size() < 1 && (companyDao.findByAdmin(company.getAdmin()).size() < 1)){
			return NOT_EXIST;
		}
		else
			return EXIST;
	}
	
	public int Login(String admin,String password){
		if((companyDao.findByAdmin(admin).size()>0) && (companyDao.findByAdmin(admin).get(0).getPassword().equals(password))){
			return LOGIN_SUC;
		}
		else
			return LOGIN_FAI;
	}
}
