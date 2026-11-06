package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;
import com.ui.pojo.AddressPOJO;
import com.utility.FakeAddressUtility;

public class AddNewFirstAddressTest extends TestBase{
	
	private MyAccountPage myAccountPage;
	private AddressPOJO address;
	
	@BeforeMethod(description = "Valid First Time user logs into the application")
	public void setup() {
		myAccountPage = homePage.goToLoginPage().doLoginWith("tokihed827@hudzer.com", "password");
//		address = new AddressPOJO("Infosys", "address line1", "address line2", "city", "12345", "7657894758", "7657394768", "other", "office address", "California");
		address = FakeAddressUtility.getFakeAddress();
	}
	
	@Test
	public void addNewAddress() {
		String newAddress = myAccountPage.goToAddAddressPage().saveAddress(address);
		Assert.assertEquals(newAddress, address.getAddressAlias().toUpperCase());
	}

}
