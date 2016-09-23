package com.kesheng.QRMaker.dao;

import java.util.List;
import com.kesheng.QRMaker.domain.ProductType;

public interface ProductTypeDao {
	ProductType get(int id);
	
	Integer save(ProductType producttype);
	
	void update(ProductType producttype);
	
	void delete(ProductType producttype);
	
	void delete(int id);
	
	List<ProductType> findAll();
}
