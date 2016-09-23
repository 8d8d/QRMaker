package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.*;

public interface ProductDao {
	Product get(int id);
	
	Integer save(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	void delete(int id);
	
	List<Product> findAll();
	
	List<Product> findByProType(ProductType producttype);
}
