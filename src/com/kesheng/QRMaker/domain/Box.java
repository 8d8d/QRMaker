package com.kesheng.QRMaker.domain;

import java.io.Serializable;
import java.util.Set;

public class Box implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoid;
	private int id;
	private int capacity;
	private Set<Product> products;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getAutoid() {
		return autoid;
	}
	public int getId() {
		return id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == Box.class){
			Box box = (Box)obj;
			return this.getId() == box.getId();
		}
		return false;
	}
	
	public int hashcode(){
		return id;
	}
	
}
