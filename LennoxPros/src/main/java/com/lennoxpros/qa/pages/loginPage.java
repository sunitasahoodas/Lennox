package com.lennoxpros.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.lennoxpros.qa.basePage.basePage;
import com.lennoxpros.qa.utils.utils;

public class loginPage extends basePage {

	public loginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signin;

	@FindBy(xpath = "//input[@id='j_username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='j_password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='loginSubmit']")
	WebElement signinbutton;
	
	@FindBy(xpath = "//img[@alt='LennoxPros Logo']")
	WebElement lennoximage;
	
    @FindBy(xpath = "//a[@href='#navigation']")
	WebElement menubutton;
	
    @FindBy(xpath = "//div[@id='page']/div[1]//div[3]/div/div[5]/a")
	WebElement salestool;
	
    @FindBy(xpath= "//a[text()='Build a Proposal']")
    WebElement buildaproposal;
   
     public void signin() {
		signin.click();
	}

	public void username() {
		username.sendKeys("lenproautomation8@lenqat.com");
	}

	public void password() {
		password.sendKeys("Community17");
	} 
    public void signinButton() {
    	signinbutton.click();
    }

    public void lennoxImage() {
    boolean dis=lennoximage.isDisplayed();
    Assert.assertTrue(dis);
    }
    public void menuButton() {
    	utils.explicitlyWait(menubutton,30);
    	menubutton.click();
    }
    public void salesTool() {
    	salestool.click();
    }
    public void buildaProposal() {
    	buildaproposal.click();
    }
}
