package TestCases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import base.w3schoolsBaseClass;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadPage;
import pages.ViewLeadPage;
import pages.w3schoolsPage;

public class Testcase_001_CardInfo extends w3schoolsBaseClass{
	
	@BeforeTest
	
	public void setValues() {
		fileName="UserData";

	}
	
	@Test(dataProvider = "fetchData")
	public void runCardInfo(String cardname,String cardnumber,
			String cvv,String firstname,String email,String address,String city,String zip,String state) {
		
		
		new w3schoolsPage(driver)
		.switchToFrame()
		.enterNameOnCard(cardname)
		.enterccNum(cardnumber)
		.enterExpMonth()
		.enterCvvNumber(cvv)
		.enterExpYear()
		.enterfirstname(firstname)
		.enterEmail(email)
		.enterAddress(address)
		.enterCity(city)
		.enterZip(zip)
		.enterState(state);
		
		
		
		
		
		
		
		
	}

}
