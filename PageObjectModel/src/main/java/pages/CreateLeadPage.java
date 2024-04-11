package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
public CreateLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
    
    public CreateLeadPage enterCompanyName() {
    	
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		
		return this;
    	
    }
    
    public CreateLeadPage enterFirstName() {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Premkumar");
		
    	return this;
    }
    
    public CreateLeadPage  enterLastName() {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murthy");
    	return this;
    	
    }
    
    public ViewLeadPage clickSubmitButton() {
    	
    	driver.findElement(By.name("submitButton")).click();
    	
    	return new ViewLeadPage(driver);
    	
    	
    	
    	
    	
    	
    }

}
