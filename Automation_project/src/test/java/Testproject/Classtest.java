package Testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		//driver.get("https://www.zoopla.co.uk/signin/?page_after_login=%2F&return_url=%2F");
		//driver.get("https://www.hotwire.com/");
		driver.manage().deleteAllCookies();
		
		
		//driver.findElement(By.xpath(""))
		//driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("email")).sendKeys("kaikobad");
		//Thread.sleep(2000);                                       
		//driver.findElement(By.id("password")).sendKeys("12323454");
		
		    //Thread.sleep(2000);
		    //driver.findElement(By.id("input-email-address")).sendKeys("kaikobad"); 
		    //driver.findElement(By.xpath("//input[@data-testid='password-field']")).sendKeys("123456");
		    //driver.findElement(By.xpath("//input[@data-testid='email-field-input']")).sendKeys("kaikobad");		
			
		    //driver.get("https://www.facebook.com/");
			//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kaikobad67@yahoo.com");
			driver.get("https://www.zillow.com/?utm_content=1471764169|65545421228|kwd-570802407|509015461848|&semQue=null&k_clickid=_kenshoo_clickid_&gclid=EAIaIQobChMIoPan9pXE9AIV2siUCR30egAXEAAYASAAEgL5OfD_BwE/");
			driver.findElement(By.xpath("//[@class='znav-transparent']")).click();
			//driver.get("https://gmail.com/");
			//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kaikobad67@yahoo.com");
		    //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
			//driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			//driver.navigate().forward();
			
			//driver.findElement(By.xpath("//*[@id="view_container"]/div/div/div[2]/div/div[1]/span/div/div/a"));
			
	}		
	}


