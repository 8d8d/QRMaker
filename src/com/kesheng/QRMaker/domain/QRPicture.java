package com.kesheng.QRMaker.domain;

import java.io.Serializable;

public class QRPicture implements Serializable {
	private static final long serialVersionUID = 48L;
	private int autoid;
	private int width;
	private int height;
	private String pagepath;
	private String fixedtext;
	private Plan plan;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getAutoid() {
		return autoid;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getPagepath() {
		return pagepath;
	}

	public String getFixedtext() {
		return fixedtext;
	}

	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}

	public void setFixedtext(String fixedtext) {
		this.fixedtext = fixedtext;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == QRPicture.class){
			QRPicture qrpicture = (QRPicture)obj;
			return this.getAutoid() == qrpicture.getAutoid();
		}
		return false;
	}
	
	public int hashcode(){
		return autoid;
	}

}
