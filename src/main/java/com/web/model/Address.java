package com.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private Integer aid;
	private String villageName;
	private Integer pincode;
	
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address", fetch = FetchType.LAZY)
	private Customer customer;

	public Address() {
		super();
	}

	public Address(Integer aid, String villageName, Integer pincode, Customer customer) {
		super();
		this.aid = aid;
		this.villageName = villageName;
		this.pincode = pincode;
		this.customer = customer;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", villageName=" + villageName + ", pincode=" + pincode + ", customer="
				+ customer + "]";
	}
	
	
    
	
	
}
