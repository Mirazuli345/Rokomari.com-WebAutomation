package testCases;

import org.testng.annotations.Test;

import pages.ShippingForm;
import pages.AuthorHumayun;
import pages.RokomariHomePage;
import utilities.SetupDriverR;

public class SignUpTest extends SetupDriverR {
	
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	ShippingForm shippingForm = new ShippingForm();
	AuthorHumayun authorHumayun = new AuthorHumayun();
	
	@Test
	public void signInTest() throws InterruptedException {
		getDriver().get("https://www.rokomari.com/");
		
		rokomariHomePage.hoverSignInInBtn();
		rokomariHomePage.emailKey("mirajul15-1720@diu.edu.bd", "181-15-1788");
		rokomariHomePage.clickSignInBtn();
	
		rokomariHomePage.hoverAuthorInBtn();
		rokomariHomePage.clickHumayun();
		authorHumayun.clickSomoKalinRochona();
		authorHumayun.clickNext();
		authorHumayun.bookOpranHo();
		authorHumayun.clickBookAddCart();
		authorHumayun.clickCartIcon();	
		shippingForm.formClean();
		shippingForm.formNameNumber("Mirajul Islam", "01924840614");
		shippingForm.altNumber("01787853905");
		
		shippingForm.country(0);
		shippingForm.city(1);
		shippingForm.area();
		
		shippingForm.address("Uttara,Dhaka,Bangladesh");
		shippingForm.paymentMethod();
		Thread.sleep(5000);
	}
	
	
	
}
