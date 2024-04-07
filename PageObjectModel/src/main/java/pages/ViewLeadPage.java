package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage verifyCreatedLead() {
		
		String pageTile=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		if(pageTile.equalsIgnoreCase("View Lead")) {
			
			System.out.println("User navigates to View Lead Page");
		}
		
		else {
			
			System.out.println("User unable to navigates to View Lead Page");
		}
		
		return this;
		
	}
	
	

}
