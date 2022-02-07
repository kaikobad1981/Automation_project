package Testproject3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	
	public static void main(String[] args) {	
System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
System.out.println("current URL is:"+driver.getCurrentUrl());
System.out.println("current Titel is:"+driver.getTitle());

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kaikobad67@yahoo.com");


	}

}
