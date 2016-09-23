package com.kesheng.QRMaker.domain;

import java.io.Serializable;

public class SaveInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoid;
	private int id;
	private String path;
	private String filename;
	private String format;
	
	public int getAutoid() {
		return autoid;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPath() {
		return path;
	}
	public String getFilename() {
		return filename;
	}
	public String getFormat() {
		return format;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == SaveInfo.class){
			SaveInfo saveinfo = (SaveInfo)obj;
			return this.getId() == saveinfo.getId();
		}
		return false;
	}
	
	public int hashcode(){
		return id;
	}
}
