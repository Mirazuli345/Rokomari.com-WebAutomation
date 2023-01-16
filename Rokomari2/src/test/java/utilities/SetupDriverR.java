package utilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriverR {
	
	private static String browserName = System.getProperty("browser","chrome");
	private static final ThreadLocal<WebDriver> DRIVER_LOCAL = new ThreadLocal<>();
	
	
	public static WebDriver getDriver() {
		
		return DRIVER_LOCAL.get();
		
	}
	
	public static void setDriver(WebDriver driver) {
		SetupDriverR.DRIVER_LOCAL.set(driver);
		
	}
	
	
	
	
	
	
	public static WebDriver getBrowser(String browserName) {
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
			
		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();

		default:
			throw new RuntimeException("No browser found");
		}
		
	}
	
	@BeforeSuite
	public static synchronized void setBrowser() {
		
		WebDriver wDriver = getBrowser(browserName);
		wDriver.manage().window().maximize();
		setDriver(wDriver);
		
	}
	
	@AfterSuite
	public static synchronized void quiteBrowser() {
		getDriver().quit();
	}

}
