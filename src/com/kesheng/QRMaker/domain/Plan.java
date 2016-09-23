package com.kesheng.QRMaker.domain;

import java.io.Serializable;
import java.sql.Date;

public class Plan implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoid;
	private int yield;
	private int status;
	private String codepre12;
	private Date createdate;
	private Com2Pro com2pro;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getAutoid() {
		return autoid;
	}
	public int getYield() {
		return yield;
	}
	public int getStatus() {
		return status;
	}
	public String getCodepre12() {
		return codepre12;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public Com2Pro getCom2pro() {
		return com2pro;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public void setYield(int yield) {
		this.yield = yield;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setCodepre12(String codepre12) {
		this.codepre12 = codepre12;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public void setCom2pro(Com2Pro com2pro) {
		this.com2pro = com2pro;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj != null && obj.getClass() == Plan.class){
			Plan plan = (Plan)obj;
			return this.getAutoid() == plan.getAutoid();
		}
		return false;
	}
	
	public int hashcode(){
		return autoid;
	}

}
