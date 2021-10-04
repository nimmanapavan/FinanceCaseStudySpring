package com.app.demo.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fms_tbl_users")
public class Users {
	@Id
	private String user_id;
	private String name;
	private Date dob;
	private String email_id;
	private long  phone_no;
	private String password;
	private String approval_status;
	private String card_type;
	private long account_no;
	private String ifsc;
	private String card_no;
	private Date date_of_registration;
	private String street;
	private long pincode;
	
	public Users(String user_id, String name, Date dob, String email_id, long phone_no, String password,
			String approval_status, String card_type, long account_no, String ifsc, String card_no,
			Date date_of_registration, String street, long pincode) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.dob = dob;
		this.email_id = email_id;
		this.phone_no = phone_no;
		this.password = password;
		this.approval_status = approval_status;
		this.card_type = card_type;
		this.account_no = account_no;
		this.ifsc = ifsc;
		this.card_no = card_no;
		this.date_of_registration = date_of_registration;
		this.street = street;
		this.pincode = pincode;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApproval_status() {
		return approval_status;
	}
	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public Date getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(Date date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}
