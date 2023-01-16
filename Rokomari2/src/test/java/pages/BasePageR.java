package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.SetupDriverR.getDriver;

import java.time.Duration;

public class BasePageR {
	
	public WebElement getElement(By locator) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	
	public void clickOnElement(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		element.click();
	}
	
	
	public void hoverElement(By locator) {
		
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
		
	}
	
	public void write(By locator,String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void mouseHover() {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public void formclear(By locator) {
		
		getElement(locator).clear();
	}
	
	public void dropDown(By loacotr, Integer value) {
		Select select = new Select(getElement(loacotr));
		//select.deselectAll();
		select.selectByIndex(value);
	}
	
	
	

}
