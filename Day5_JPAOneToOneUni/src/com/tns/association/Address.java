package com.tns.association;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="ID")
	private int addressId;
	@Column(name="Street")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;
	
	//@OneToOne(mappedBy="address")
	//private Employee employee;
	public Address() {
		super();
	}
	public Address(int addressId, String street, String city, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	

}