package com.lennoxpros.qa.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lennoxpros.qa.basePage.basePage;

public class utils  extends basePage{
 
	public static void explicitlyWait(WebElement wel,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver, time);
	    wait.until(ExpectedConditions.elementToBeClickable(wel));
	
	}
  

}
