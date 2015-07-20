package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  
  @Test
  public void tesNonEmptyContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData();
	contact.firstName = "name 1";
	contact.lastName = "last name 1";
	contact.address = "address 1";
	contact.phoneHome = "0987654321";
	contact.phoneMobile = "0987654322";
	contact.phoneWork = "0987654333";
	contact.email = "1@mail.com";
	contact.email2 = "2@mail.com";
	contact.bday = "1";
	contact.bmonth = "January";
	contact.byear = "1990";
	contact.groupName = "group 2";
	contact.secondaryAddress = "address 2";
	contact.secondaryPhone = "0987654444";
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
  
  @Test
  public void tesEmptyContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "[none]", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}