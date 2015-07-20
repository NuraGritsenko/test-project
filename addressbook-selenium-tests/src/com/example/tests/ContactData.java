package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address;
	public String phoneHome;
	public String phoneMobile;
	public String phoneWork;
	public String email;
	public String email2;
	public String bday;
	public String bmonth;
	public String byear;
	public String groupName;
	public String secondaryAddress;
	public String secondaryPhone;

	public ContactData() {
	}
	
	public ContactData(String firstName, String lastName, String address,
			String phoneHome, String phoneMobile, String phoneWork,
			String email, String email2, String bday, String bmonth,
			String byear, String groupName, String secondaryAddress,
			String secondaryPhone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneHome = phoneHome;
		this.phoneMobile = phoneMobile;
		this.phoneWork = phoneWork;
		this.email = email;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.groupName = groupName;
		this.secondaryAddress = secondaryAddress;
		this.secondaryPhone = secondaryPhone;
	}
}