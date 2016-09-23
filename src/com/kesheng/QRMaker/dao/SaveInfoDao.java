package com.kesheng.QRMaker.dao;

import com.kesheng.QRMaker.domain.SaveInfo;

public interface SaveInfoDao {
	SaveInfo get(int id);
	
	Integer save(SaveInfo saveinfo);
	
	void update(SaveInfo saveinfo);
	
	void delete(SaveInfo saveinfo);
	
	void delete(int id);
}
