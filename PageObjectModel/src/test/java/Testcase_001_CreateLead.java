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
		/*
		 * LoginPage login=new LoginPage(); login.enterUserName(); login.enterPwd();
		 * login.clickLoginBtn();
		 */
		
		new LoginPage()
		.enterUserName()
		.enterPwd()
		.clickLoginBtn();
		
		new HomePage()
		.verifyPageInfo()
		.clickCrmsfaLink();
	
		
		
		new MyHomePage()
		.clickLeadsLink();
		
		
		new MyLeadPage()
		.clickCreateLeadLink();
		
		new CreateLeadPage()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmitButton();
		
		new ViewLeadPage()
		
		.verifyCreatedLead();
		
	}

}
