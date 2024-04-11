package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.w3schoolsBaseClass;

public class w3schoolsPage extends w3schoolsBaseClass {
	
	
	public w3schoolsPage(ChromeDriver driver){
		
		this.driver=driver;
		
		
	}
	
	public w3schoolsPage switchToFrame() {
		
		driver.switchTo().frame("iframeResult");
		
		return this;
		
	}
		
		public w3schoolsPage enterNameOnCard(String cardname) {
			
			driver.findElement(By.id("cname")).clear();
			
			driver.findElement(By.id("cname")).sendKeys(cardname);
			
			return this;
		}
		
		
public w3schoolsPage enterccNum(String cardnumber) {
			
	driver.findElement(By.id("ccnum")).clear();
	
	driver.findElement(By.id("ccnum")).sendKeys(cardnumber);
	
	return this;
		}
		
		

public w3schoolsPage enterExpMonth() {
	
	driver.findElement(By.id("expmonth")).clear();
	
	driver.findElement(By.id("expmonth")).sendKeys("Oct");
	
	return this;
}
		
		

public w3schoolsPage enterCvvNumber(String cvv) {
	
	driver.findElement(By.id("cvv")).clear();
	
	driver.findElement(By.id("cvv")).sendKeys(cvv);
	
	return this;
}
				
		
public w3schoolsPage enterExpYear() {
	
	driver.findElement(By.id("expyear")).clear();
	
	driver.findElement(By.id("expyear")).sendKeys("2018");
	
	return this;
}	

		

public w3schoolsPage enterfirstname(String firstname) {
	
	driver.findElement(By.id("fname")).clear();
	
	driver.findElement(By.id("fname")).sendKeys(firstname);
	
	return this;
}
		
	

public w3schoolsPage enterEmail(String email) {
	
	driver.findElement(By.id("email")).clear();
	
	driver.findElement(By.id("email")).sendKeys(email);
	return this;
}
	
	
public w3schoolsPage enterAddress(String address) {
	
	driver.findElement(By.id("adr")).clear();
	
	driver.findElement(By.id("adr")).sendKeys(address);
	return this;
	
	
}

	
public w3schoolsPage enterCity(String city) {
	
	
driver.findElement(By.id("city")).clear();
	
	driver.findElement(By.id("city")).sendKeys(city);
	
	return this;
	
	
}


public w3schoolsPage enterZip(String zip) {
	
	driver.findElement(By.id("zip")).clear();
	
	driver.findElement(By.id("zip")).sendKeys(zip);
	
	return this;
	
}


public w3schoolsPage enterState(String state) {
	
	driver.findElement(By.id("state")).clear();
	
	driver.findElement(By.id("state")).sendKeys(state);
	return this;
	
}

		
		
		

		

		
		
		
		
		
		
	}
 
	
	


