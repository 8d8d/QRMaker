package com.kesheng.QRMaker.dao;

import java.util.List;

import com.kesheng.QRMaker.domain.*;

public interface QRPictureDao {
	QRPicture get(int id);
	
	Integer save(QRPicture qrpicture);
	
	void update(QRPicture qrpicture);
	
	void delete(QRPicture qrpicture);
	
	void delete(int id);
	
	List<QRPicture> findAll();
}
