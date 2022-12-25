package com.org.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.qa.baseClass.TestBase;

public class LoginPage extends TestBase {
 
	//Page Factory -OR
	@FindBy(name = "email")
	WebElement Username;
	
    @FindBy(name = "pass")
    WebElement Password;
    
    @FindBy(name="login")
    WebElement loginbtn;
    
    @FindBy(className = "_97w5")
    WebElement signup;
    
    @FindBy(xpath ="//img[@class='_97vu img']")
    WebElement facebookLogo;
    
    public LoginPage() {
    	PageFactory.initElements(driver, this);//this means intialize current class object
    }
  
    //Actions
    public String validateLoginPageTitle() {
    	return driver.getTitle();
    }
    
    public boolean validateLogomage() {
    	return facebookLogo.isDisplayed();
    }
    
    public HomePage login(String un,String pw) {
    	Username.sendKeys(un);
    	Password.sendKeys(pw);
    	loginbtn.click();
    	return new HomePage();
    	
    }
    
    
    
    
}
