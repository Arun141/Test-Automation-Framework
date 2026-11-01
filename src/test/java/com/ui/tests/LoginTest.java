package com.ui.tests;


import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.constants.Browser.*; //static no need to use Browser.CHROME, directly use values
import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;

/*
 * Test Method:-
 * 1) Test Script Small!
 * 2) You cannot have conditional statements, loops, try catch in your test method
 *  TestScripts ---> Test Steps
 * 3) Reduce the use of Local Variables!!
 * 4) Atleast one assertion!
 */
@Listeners(com.ui.listeners.TestListener.class)
public class LoginTest extends TestBase{  
	Logger logger = LoggerUtility.getLogger(this.getClass());

	
	@Test(description = "Verifies with the valid user is able to login into the application", 
			groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, 
			dataProvider = "LoginTestDataProvider")
	public static void loginTest(User user) {
		
		Assert.assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Arun Kumar Burra");
	}
	
//	@Test(description = "Verifies with the valid user is able to login into the application", 
//			groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, 
//			dataProvider = "LoginTestCSVDataProvider")
//	public static void loginCSVTest(User user) {
//		
//		Assert.assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
//				"Arun Kumar Burra");
//	}
//	
//	@Test(description = "Verifies with the valid user is able to login into the application", 
//			groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, 
//			dataProvider = "LoginTestExcelDataProvider", retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
//	public void loginExcelTest(User user) {
//		
//		Assert.assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
//				"Arun Kumar Burra");
//
//	}
}
