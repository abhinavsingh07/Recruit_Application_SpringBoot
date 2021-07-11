package com.abhiwork.model;

public class Address {
	
	private String address;
	private String state;
	private String city;
	private int zip;
	
	public Address(String address, String state, String city, int zip) {
		super();
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", state=" + state + ", city=" + city + ", zip=" + zip + "]";
	}
}
