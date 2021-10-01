package com.app.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fms_tbl_bankdetails")
public class Bankdetails 
{
	@Id
	private String ifsc;
	private String bank_name;
	private String location;
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Bankdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
