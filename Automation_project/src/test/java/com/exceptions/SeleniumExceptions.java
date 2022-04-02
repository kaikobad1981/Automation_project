package com.exceptions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.baseclass.BaseClass;

public class SeleniumExceptions extends BaseClass{
         public void StaleElementExample() {
        	 
        	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
     				.withTimeout(30, TimeUnit.SECONDS)
     				.pollingEvery(5, TimeUnit.SECONDS)
     				.ignoring(NoSuchElementException.class);
         }
}
