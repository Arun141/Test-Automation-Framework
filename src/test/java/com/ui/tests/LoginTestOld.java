package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOld {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //Launch a Browser Window!! Browser Session is created!!
		
//		BrowserUtility browserUtility = new BrowserUtility(wd);
//		browserUtility.goToWebsite("https://automationpractice.techwithjatin.com/");
//		browserUtility.maximizeWindow();
//		
//		//8 Locating Techniques - id, name, x-path, className, linkText, partialLinkText, tagName, cssSelector
//		// By Class is responsible for handling locators
//		//you need to create object to access the static methods inside a class
//		By signInLinkLocator = By.xpath("//a[contains(text(),'Sign')]");
//		browserUtility.clickOn(signInLinkLocator);
//		
//		By emailTextBoxLocator = By.id("email");
//		browserUtility.enterText(emailTextBoxLocator, "tokihed827@hudzer.com");
//		
//		By passwordTextBoxLocator=By.id("passwd");
//		browserUtility.enterText(passwordTextBoxLocator, "password");
//
//		
//		By submitLoginButtonLocator=By.id("SubmitLogin");
//		browserUtility.clickOn(submitLoginButtonLocator);
	}

}
