package TestCases;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadPage;
import pages.ViewLeadPage;

public class Testcase_001_CreateLead extends BaseClass{
	
	
	@Test
	public void runCreateLead() {
	
		
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.clickLoginBtn();
		
		new HomePage(driver)
		.verifyPageInfo()
		.clickCrmsfaLink();
	
		
		
		new MyHomePage(driver)
		.clickLeadsLink();
		
		
		new MyLeadPage(driver)
		.clickCreateLeadLink();
		
		new CreateLeadPage(driver)
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmitButton();
		
		new ViewLeadPage(driver)
		
		.verifyCreatedLead();
		
	}

}
