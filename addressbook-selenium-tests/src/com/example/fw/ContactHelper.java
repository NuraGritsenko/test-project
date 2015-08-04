package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
	    type(By.name("address"), contact.address);
	    type(By.name("home"), contact.phoneHome);
	    type(By.name("mobile"), contact.phoneMobile);
	    type(By.name("work"), contact.phoneWork);
	    type(By.name("email"), contact.email);
	    type(By.name("email2"), contact.email2);
	    selectByText(By.name("bday"), contact.bday);
	    selectByText(By.name("bmonth"), contact.bmonth);
	    type(By.name("byear"), contact.byear);
	    selectByText(By.name("new_group"), contact.groupName);
	    type(By.name("address2"), contact.secondaryAddress);
	    type(By.name("phone2"), contact.secondaryPhone);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}
	
	private void selectContactByIndex(int index) {
		click(By.xpath("//table/tbody/tr[" + index + "]/td[1]/input"));
	}

	public void initContactModification(int index) {
		selectContactByIndex(index);
		selectActionByIndex(index);
		}

	private void selectActionByIndex(int index) {
		click(By.xpath("//table/tbody/tr[" + index + "]/td[7]/a/img"));
	}
	
	public void submitContactModification() {
		click(By.xpath("//input[11]"));
	}

	public void deleteContact(int index) {
		selectContactByIndex(index);
		selectActionByIndex(index);
		click(By.xpath("//input[2]"));
	}
}