/*Changes done For Sba Purpose*/


package com.sba.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerSba")
public class Customer {
	
	@Id
	private int id;
	private String custname;
	private String custdoj;
	private String custcity;
	private String custphone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustdoj() {
		return custdoj;
	}
	public void setCustdoj(String custdoj) {
		this.custdoj = custdoj;
	}
	public String getCustcity() {
		return custcity;
	}
	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}
	public String getCustphone() {
		return custphone;
	}
	public void setCustphone(String custphone) {
		this.custphone = custphone;
	}
	


}
