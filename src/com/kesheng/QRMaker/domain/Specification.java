package com.kesheng.QRMaker.domain;

import java.io.Serializable;

public class Specification implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoid;
	private int id;
	private String specification;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getAutoid() {
		return autoid;
	}
	public int getId() {
		return id;
	}
	public String getSpecification() {
		return specification;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == Specification.class){
			Specification specification = (Specification)obj;
			return this.getId() == specification.getId();
		}
		return false;
	}
	
	public int hashcode(){
		return id;
	}
}
