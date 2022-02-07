package com.pagefactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.BaseClass;

public class PageFactoryElements extends BaseClass {
	
	public PageFactoryElements() { 
	PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="(//*[text()='Sign in'])[2]")
		@CacheLookup
	private WebElement login;
		
	public WebElement getLogin() {
		return login;
	}
	//public WebElement getLogin() {
		//return login;
	//}
	     @FindBy(id="input-email-address")
	     @CacheLookup
     private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	    @FindBy(id="input-password")
	    @CacheLookup
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	    @FindBy(xpath="(//*[text()='Sign in'])[5]")
	    @CacheLookup
    private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}
}
