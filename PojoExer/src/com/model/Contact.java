package com.model;

public class Contact implements Comparable<Contact>{ 

	
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param address
	 */
	public Contact(String firstName, String lastName, String phoneNumber, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}


	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Contact contact) {
		// TODO Auto-generated method stub
		return this.getFirstName().compareTo(contact.getFirstName());
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


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
}
