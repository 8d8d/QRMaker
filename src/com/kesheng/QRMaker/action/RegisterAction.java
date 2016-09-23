package com.kesheng.QRMaker.action;

import com.kesheng.QRMaker.domain.Company;
import com.kesheng.QRMaker.service.User;
import com.kesheng.QRMaker.service.impl.UserImpl;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Company company = new Company();
	private UserImpl user;
	private String tips;
	private String id;
	private String name;
	private String admin;
	private String password;
	private String password2;
	private String email;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Company getCompany() {
		return company;
	}


	public UserImpl getUser() {
		return user;
	}


	public String getTips() {
		return tips;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAdmin() {
		return admin;
	}


	public String getPassword() {
		return password;
	}


	public String getPassword2() {
		return password2;
	}


	public String getEmail() {
		return email;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	public void setUser(UserImpl user) {
		this.user = user;
	}


	public void setTips(String tips) {
		this.tips = tips;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAdmin(String admin) {
		this.admin = admin;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String execute() throws Exception{
		company.setId(Integer.valueOf(id).intValue());
		company.setName(name);
		company.setAdmin(admin);
		company.setPassword(password);
		company.setEmail(email);
		
		if(getUser().Register(company) == User.NOT_EXIST){
			if(password.equals(password2)){
				user.getCompanyDao().save(company);
				return SUCCESS;
			}
			else{
				return ERROR;
			}
		}
		else
			return ERROR;
	}
}
