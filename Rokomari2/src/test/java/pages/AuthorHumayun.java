package pages;

import org.openqa.selenium.By;

public class AuthorHumayun extends BasePageR {
	
	By UPONNASH = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	By ROCHONA = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	By NEXT = By.linkText("Next");
	By BOOK = By.xpath("//div[@title='অপরাহ্ণ হুমায়ূন আহমেদ']");
	By BOOKADDCART = By.xpath("//button[@product-id='130']");
	By CARTICON = By.id("js-cart-menu");
	By PLACEORDER = By.id("js-continue-to-shipping");
	
	public void clickSomoKalinRochona() {
		clickOnElement(UPONNASH);
		clickOnElement(ROCHONA);
		mouseHover();
		
	}
	public void clickNext() {
		clickOnElement(NEXT);
	}
	
	public void bookOpranHo() {
		hoverElement(BOOK);
	}
	
	public void clickBookAddCart() {
		clickOnElement(BOOKADDCART);
	}
	
	public void clickCartIcon() {
		clickOnElement(CARTICON);
		clickOnElement(PLACEORDER);
	}
	
	
	

}
