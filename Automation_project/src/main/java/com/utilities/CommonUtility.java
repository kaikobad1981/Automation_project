package com.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.google.common.io.Files;

public class CommonUtility extends BaseClass {
public static WebElement getExplicitWait(WebElement elem,long time) {
WebDriverWait wait=new WebDriverWait(driver,time);
WebElement element= wait.until(ExpectedConditions.elementToBeClickable(elem));
    return element;
}

public static void takesScreenShot() throws IOException  { //"File" is a class comes from java"srcFile"
	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //Type casting polymorphism
	File targetFile = new File(System.getProperty("user.dir") + "//screenshot/screenshot.png");
	targetFile.getParentFile().mkdir();      
	srcFile.createNewFile();
	Files.copy(srcFile, targetFile);  //.copy(srcFile, targetFile);
		           
	//TakesScreenshot import from scelenium.
	    //getScreenshotAs import from 
}
public static void getHighLighter(WebElement element) {
	JavascriptExecutor executor = (JavascriptExecutor) driver; //Type casting
	executor.executeScript("arguments[0].setAttribute('style','background: green; border: 4px solid black;')", element);
	
}
public static void actionClick(WebElement element) {
	Actions action=new Actions(driver);  //JavascriptExecutor executor=(JavascriptExecutor)driver;
	action.click(element).build().perform();//executor.executeScript("arguments[0].click()",element);
	
}
	
}

