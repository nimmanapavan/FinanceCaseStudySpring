package com.app.demo.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fms_tbl_orders")
public class Orders 
{
	@Id
	private String order_id;
	private String user_id;
	private String prod_id;
	private Date date_of_purchase;
	private int emi_period;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public Date getDate_of_purchase() {
		return date_of_purchase;
	}
	public void setDate_of_purchase(Date date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
	public int getEmi_period() {
		return emi_period;
	}
	public void setEmi_period(int emi_period) {
		this.emi_period = emi_period;
	}
	public Orders(String order_id, String user_id, String prod_id, Date date_of_purchase, int emi_period) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.prod_id = prod_id;
		this.date_of_purchase = date_of_purchase;
		this.emi_period = emi_period;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}