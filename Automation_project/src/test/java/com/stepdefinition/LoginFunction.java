
package com.stepdefinition;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.baseclass.BaseClass;
import com.pagefactory.PageFactoryElements;
import com.utilities.CommonUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunction  extends BaseClass{

	PageFactoryElements pf; //instance variable
	
	@Given("User can open any browser")
	public void user_can_open_any_browser(){ 
		 // setUp(); //representing baseclass setUp items/properties
		  pf= PageFactory.initElements(driver, PageFactoryElements.class);
	}
	@Given("User is able to enter url {string}")
	public void user_is_able_to_enter_url(String url) {  //here one Url representing another
	     driver.get(url);                                // and Url from feature file
	}
	@When("User clicks on the Login in button")
	public void user_clicks_on_the_login_in_button() throws IOException{ 
		 CommonUtility.getExplicitWait(pf.getLogin(), 15); //explicitwait time method 
		 CommonUtility.getHighLighter(pf.getLogin());
		 CommonUtility.takesScreenShot();
		 pf.getLogin().click();//we stored elements in PF so removed element and put pf...
		//CommonUtility.actionClick(pf.getSignIn()); //action class if click not working
	}
	
	@When("User enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) { 
		// CommonUtility.getHighLighter(pf.getEmail()); 
		 pf.getEmail().sendKeys(email);
	     pf.getPassword().sendKeys(password);
    }
	@When("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() { 
	    //CommonUtility.getjsClick(pf.getSignIn();
		pf.getSignIn().click();
	}
	@Then("User is able to verify successful login & verify page title")
	public void user_is_able_to_verify_successful_login_verify_page_title() {
		System.out.println("The title of the website is:"+driver.getTitle());
	Assert.assertEquals("Sign in to Zoopla", driver.getTitle());
		
		driver.quit();
	}
}
