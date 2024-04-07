package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadPage extends BaseClass {
	
	public CreateLeadPage clickCreateLeadLink() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLeadPage();
		
		
}
	
	
	
	
	
}
