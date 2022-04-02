package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver; //Global variable
	
	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver(); // UpCasting polymorphism
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	//crossbrowser test
	@BeforeMethod (enabled=false)
	@Parameters("browser")
	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        driver=new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	        driver = new FirefoxDriver();  
		}
		else {
			System.out.println("The browser does not exist");
		
		}
		
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().refresh();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
	    
//	@Test
//        public void openApplication() {
//		driver.get("https://www.facebook.com/");{
//			}
//		
////		
//	driver.quit();
	//}
	
//	public void setUp() {
//		where do you implement interface in your framework
//    Ans: WebDriver is the interface in m framework
//		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        driver.navigate().refresh();
//        
//		   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//}       
	

