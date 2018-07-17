package com.glarimy.java.bank.api;

public class Customer {
	private String name;
	private long phoneNumber;

	public Customer() {

	}

	public Customer(String name, long phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
