package com.googlecode.commons.swing.demo.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class Customer {

	private long id;
	private String firstName;
	private String lastName;
	private String eMailAddress;
	private Gender gender; // = Gender.UNKNOWN;
	private boolean newsletter;
	
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMailAddress() {
		return eMailAddress;
	}

	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	public static Customer createCustomer() {
		Customer c1 = new Customer();
		c1.setId(1L);
		c1.setFirstName("Maximilian Simon");
		c1.setLastName("Mustermann");
		c1.seteMailAddress("commons-swing@googlecode.com");
		
		Address a = new Address();
		a.setId(1L);
		a.setAddress1("Musterstraﬂe 1");
		a.setCity("Musterstadt");
		a.setZip("12345");
		c1.setAddress(a);
		
		return c1;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
