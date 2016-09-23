package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.Com2Pro;
import com.kesheng.QRMaker.domain.Company;

public interface Com2ProDao {
	Integer save(Com2Pro com2pro);
	
	void update(Com2Pro com2pro);
	
	void delete(Com2Pro com2pro);
	
	List<Com2Pro> findAll();
	
	List<Com2Pro> findByCom(Company company);
}
