package com.org.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.qa.baseClass.TestBase;
import com.org.qa.pages.HomePage;
import com.org.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage lPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initilization();
		 lPage=new LoginPage();
		
	}
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=lPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Log in to Facebook");
	}
	
	@Test(priority = 2)
	public void loginPageImageTets() {
		boolean flag=lPage.validateLogomage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest() throws InterruptedException {
		homePage=lPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(50000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
