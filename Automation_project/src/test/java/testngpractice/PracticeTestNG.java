package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class PracticeTestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().refresh();
		}
	
	@Test
	public void openApplication() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kaikobad67@yahoo.com");
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}
	@AfterMethod  
    public void closeApplication() {
       	driver.quit();
    }
}
