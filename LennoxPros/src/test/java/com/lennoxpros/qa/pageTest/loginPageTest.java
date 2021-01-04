package com.lennoxpros.qa.pageTest;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lennoxpros.qa.basePage.basePage;
import com.lennoxpros.qa.pages.loginPage;

public class loginPageTest extends basePage {

	@BeforeMethod
	public void setUp() {
		basePage.initialization();

	}

	@Test(priority = 1)
	public void login() {
		loginPage log = new loginPage();
		log.signin();
	}

	@Test(priority = 2)
	public void username() {
		loginPage log = new loginPage();
		log.signin();
		log.username();
		log.password();
		log.menuButton();
	}

	@Test(priority = 3)
	public void lennoximage() {
		loginPage log = new loginPage();
		log.signin();
		log.username();
		log.password();
		log.menuButton();
		log.lennoxImage();
	}

	@Test(priority = 4)
	public void menuButton() {
		loginPage log = new loginPage();
		log.signin();
		log.username();
		log.password();
		log.signinButton();
		log.menuButton();
	}

	@Test(priority = 5)
	public void salesTool() {
		loginPage log = new loginPage();
		log.signin();
		log.username();
		log.password();
		log.signinButton();
		log.menuButton();
		log.salesTool();
	}

	@Test(priority = 6)
	public void buildProposal() {
		loginPage log = new loginPage();
		log.signin();
		log.username();
		log.password();
		log.signinButton();
		log.menuButton();
		log.salesTool();
		log.buildaProposal();
	}

	// @AfterMethod
	public void tearDown() {
		driver.close();

	}

}
