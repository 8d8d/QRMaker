package com.kesheng.QRMaker.domain;

import java.io.Serializable;
import java.sql.Date;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private int autoid;
	private int id;
	private ProductType producttype;
	private Date pdcdate;
	private Date packdate;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getAutoid() {
		return autoid;
	}
	public int getId() {
		return id;
	}

	public ProductType getProducttype() {
		return producttype;
	}
	public void setProducttype(ProductType producttype) {
		this.producttype = producttype;
	}
	public Date getPdcdate() {
		return pdcdate;
	}
	public Date getPackdate() {
		return packdate;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPdcdate(Date pdcdate) {
		this.pdcdate = pdcdate;
	}
	public void setPackdate(Date packdate) {
		this.packdate = packdate;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == Product.class){
			Product pro = (Product)obj;
			return this.getId() == pro.getId();
		}
		return false;
	}
	
	public int hashcode(){
		return id;
	}
}
