package com.kesheng.QRMaker.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	public String execute() {
		Map<String,Object> sessions = ActionContext.getContext().getSession();
		for(Map.Entry<String, Object>entry : sessions.entrySet()){
			String key = entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
		ActionContext.getContext().getSession().clear();
		return SUCCESS;
	}
}
