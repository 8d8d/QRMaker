package com.kesheng.QRMaker.service;

import com.kesheng.QRMaker.domain.*;

public interface User {
	public static final int NOT_EXIST = 0;
	public static final int EXIST = 1;
	
	public static final int LOGIN_SUC = 0;
	public static final int LOGIN_FAI = 1;
	
	int Register(Company com);
	
	int Login(String name,String password);
}
