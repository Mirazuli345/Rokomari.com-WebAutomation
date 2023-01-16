package pages;

import org.openqa.selenium.By;

public class ShippingForm extends BasePageR {
	By NAME = By.id("name");
	By PHONE = By.xpath("//input[@name='phone']");
	By ALTPHONE = By.xpath("//input[@name='phone2']");
	By COUNTRY = By.xpath("//select[@id='js--country']");
	By CITY = By.id("js--city");
	By AREA = By.xpath("//option[@value='110']");
	By ADDRESS = By.id("address");
	By PAYMENT = By.xpath("//label[@for='nagad']");
	
	
	public void formClean() {
		formclear(NAME);
		formclear(PHONE);
	}
	
	public void formNameNumber(String name, String number) {
		write(NAME, name);
		write(PHONE, number);
		
	}
	public void altNumber(String alt) {
		write(ALTPHONE, alt);
		
	}
	public void address(String add) {
		write(ADDRESS, add);
	}
	
	public void paymentMethod() {
		clickOnElement(PAYMENT);
	}
	
	public void country(Integer value) {
		dropDown(COUNTRY, value);
		
	}
	
	public void city(Integer value) {
		dropDown(CITY, value);
	}
	
	
	public void area() {
		clickOnElement(AREA);
	}
	
	
	

}
