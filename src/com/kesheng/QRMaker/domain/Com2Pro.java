package com.kesheng.QRMaker.domain;

import java.io.Serializable;

public class Com2Pro implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoid;
	private Company company;
	private ProductType producttype;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getAutoid() {
		return autoid;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public Company getCompany() {
		return company;
	}
	public ProductType getProducttype() {
		return producttype;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setProducttype(ProductType producttype) {
		this.producttype = producttype;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == Com2Pro.class){
			Com2Pro com2pro = (Com2Pro)obj;
			return this.getAutoid() == com2pro.getAutoid();
		}
		return false;
	}
	
	public int hashcode(){
		return autoid;
	}
}
