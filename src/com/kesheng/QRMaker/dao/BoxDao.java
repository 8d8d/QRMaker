package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.Box;

public interface BoxDao {
	Box get(int id);
	
	Integer save(Box box);
	
	void update(Box box);
	
	void delete(Box box);
	
	void delete(int id);
	
	List<Box> findAll();
	
	List<Box> findById(String id);
}
