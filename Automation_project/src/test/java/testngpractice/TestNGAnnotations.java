package testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("I am running before Suite");
	}
	
	@BeforeTest
    public void bforeTest() {	
	System.out.println("I am running before Test");
	}
    @BeforeClass
    public void beforeClass() {
	System.out.println("I am running before Class");
}
    @BeforeMethod
    public void beforeMethod() {
	System.out.println("I am running before Method");
}
    @Test(priority=1)
    public void LoginTest() {
	System.out.println("I am the LoginTest");
}
    
    @Test(priority=3)//it is dependsOnMethods:-(dependsOnMethods={"LoginTest"})
    public void CheckprofileTest() {
	System.out.println("I am the CheckprofileTest ");//if login fail CheckprofileTest 
	                                                  //will also fail.
}                                                     
    @Test(priority=2,invocationCount=10, enabled=false)//invocationCount will run as mention the count
                                                       //enabled=false will disable test even the order
                                                        //by default enable is "true"
    public void SearchTest() {
	System.out.println("I am the SearchTest");
}
    
    @AfterMethod
     public void AfterMethod() {
	System.out.println("I am running after Method");
}
    @AfterClass
    public void afterClass() {
	System.out.println("I am running after Class");	
}
    @AfterTest
    public void afterTest() {
	System.out.println("I am running after Test");
}
    @AfterSuite
    public void afterSuite() {
	System.out.println("I am running after Suite");
}


}