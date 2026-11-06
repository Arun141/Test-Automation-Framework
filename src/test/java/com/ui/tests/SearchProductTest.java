package com.ui.tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;
import com.utility.LoggerUtility;

@Listeners(com.ui.listeners.TestListener.class)
public class SearchProductTest extends TestBase{
	
	private static MyAccountPage myAccountPage;
	private static final String SEARCH_TERM = "Printed Summer Dress";
	
	@BeforeMethod(description = "Valid user logs into the application")
	public void setup() {
		myAccountPage = homePage.goToLoginPage().doLoginWith("tokihed827@hudzer.com", "password");
	}
	
	@Test(description = "Verify if the User is able to search for a product and correct products search result are displayed", 
			groups = {"e2e","sanity","smoke"})
	public static void verifyproductSearchTest() {		
		boolean actualResult = myAccountPage.searchForAProduct(SEARCH_TERM).getAllDressesName(SEARCH_TERM);
		
		Assert.assertEquals(actualResult, false);
	}
	

}