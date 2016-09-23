package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.*;

public interface CompanyDao {
	Company get(int id);
	
	Integer save(Company company);
	
	void update(Company company);
	
	void delete(Company company);
	
	void delete(int id);
	
	List<Company> findAll();
	
	List<Company> findById(int id);
	
	List<Company> findByAdmin(String admin);
}
