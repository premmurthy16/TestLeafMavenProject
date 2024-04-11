package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
public HomePage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public HomePage verifyPageInfo() {
		
		//String pageTitle=driver.findElement(By.tagName("h2")).getText();
		
		//Leaftaps - TestLeaf Automation Platform
		
		String pageTitle=driver.getTitle();
		
		System.out.println("pageTitle " + pageTitle);
		
		if(pageTitle.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			
			System.out.println("User navigates to Home Page");
		}
		
		
		else {
			
			System.out.println("User unable navigates to Home Page");
			
		}
		
		return this;
		
		
	}
	public MyHomePage clickCrmsfaLink() {
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		return new MyHomePage(driver);
		
		
		
		
	}
	

}
