package com.kesheng.QRMaker.action;

import com.kesheng.QRMaker.domain.Company;
import com.kesheng.QRMaker.service.User;
import com.kesheng.QRMaker.service.impl.UserImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Company company = new Company();
	private String admin;
	private String password;
	private UserImpl user;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public UserImpl getUser() {
		return user;
	}

	public void setPass(String password) {
		this.password = password;
	}

	public void setUser(UserImpl user) {
		this.user = user;
	}

	public String execute() throws Exception{
		company.setAdmin(admin);
		company.setPassword(password);
		
		if(user.Login(admin,password) == User.LOGIN_SUC){
			ActionContext.getContext().getSession().put("admin", admin);
			return "login";
		}
		else
			return ERROR;
	}
}
