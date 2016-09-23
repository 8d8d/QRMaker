package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.ProductType;
import com.kesheng.QRMaker.domain.Specification;

public interface SpecificationDao {
	Specification get(int id);
	
	Integer save(Specification specification);
	
	void update(Specification specification);
	
	void delete(Specification specification);
	
	void delete(int id);
	
	List<Specification> findAll();
	
	List<Specification> findByProType(ProductType producttype);
}
