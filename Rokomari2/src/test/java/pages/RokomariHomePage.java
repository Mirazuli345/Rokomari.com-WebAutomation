package pages;

import org.openqa.selenium.By;

public class RokomariHomePage extends BasePageR {
	By SIGNIN = By.xpath("//a[contains(text(),'Sign in')]");
	By EMAIL = By.xpath("//input[@id='j_username']");
	By PASS = By.xpath("//input[@id='j_password']");
	By SIGNBTN = By.xpath("//button[contains(text(),'Sign In')]");
	By AUTHORS = By.xpath("//a[@id='js--authors']");
	By HUMAYUN = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	
	
	
	
	public void hoverSignInInBtn() {
		hoverElement(SIGNIN);
	}
	
	public void emailKey(String email,String pass) {
		write(EMAIL, email);
		write(PASS, pass);
	}
	
	public void clickSignInBtn() {
		clickOnElement(SIGNBTN);
	}
	
	
	public void hoverAuthorInBtn() {
		hoverElement(AUTHORS);
	}
	
	public void clickHumayun() {
		clickOnElement(HUMAYUN);
	}
	

}
 