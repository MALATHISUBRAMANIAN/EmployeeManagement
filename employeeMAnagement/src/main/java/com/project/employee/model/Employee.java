package com.project.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@Column
	private Long empid;
	@Column
	private String empname;
	@Column
	private String mailid;
	@Column
	private long contactnumber;
	@Column
	private String qualification;
	@Column
	private boolean detailsFlag;
	
	
	public boolean isDetailsFlag() {
		return detailsFlag;
	}
	public void setDetailsFlag(boolean detailsFlag) {
		this.detailsFlag = detailsFlag;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
