package com.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column
	private String email;
	@Column
	private String fname; 
	@Column
	private String lname;
	@Column
	private String mname;
	@Column
	private String dob;
	@Column
	private String phone;
	@Column
	private long ssn;
	@Column
	private String pswd;
	@Column
	private boolean status;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public Customer() {
		super();
	}
	public Customer(String email, String fname, String lname, String mname, String dob, String phone, long ssn,
			String pswd, boolean status) {
		super();
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.dob = dob;
		this.phone = phone;
		this.ssn = ssn;
		this.pswd = pswd;
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Customer(long id, String email, String fname, String lname, String mname, String dob, String phone, long ssn,
			String pswd, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.dob = dob;
		this.phone = phone;
		this.ssn = ssn;
		this.pswd = pswd;
		this.status = status;
	}
	
}
