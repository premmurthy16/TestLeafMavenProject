package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadPage extends BaseClass {
	
public MyLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLeadPage(driver);
		
		
}
	
	
	
	
	
}
