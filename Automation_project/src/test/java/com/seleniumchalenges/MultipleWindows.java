package com.seleniumchalenges;

import org.openqa.selenium.By;

import com.baseclass.BaseClass;

public class MultipleWindows extends BaseClass{

	//How to handle multiple windows?
	
	public static void switchWindow() {
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		//
	}
	
}
