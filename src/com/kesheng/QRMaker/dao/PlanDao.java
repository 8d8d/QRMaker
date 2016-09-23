package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.*;

public interface PlanDao {
	Plan get(int id);
	
	Integer save(Plan plan);
	
	void update(Plan plan);
	
	void delete(Plan plan);
	
	void delete(int id);
	
	List<Plan> findAll();
}
