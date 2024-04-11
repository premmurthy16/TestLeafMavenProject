package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.ReadData;



public class w3schoolsBaseClass {
	
	public ChromeDriver driver;
	public String fileName;
	
	@BeforeSuite
	public void precondition() {
		
	driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		
				
	}
	
	 @BeforeMethod
	 
	 @DataProvider(name="fetchData") 
	 public String[][] sendData() throws
	 IOException { 
	 String[][] readData = utils.ReadData.readData(fileName);
	// readData; 
	 
	 return ReadData.readData(fileName);
	
	 
	 }
	
	@AfterMethod
	public void postCondition() {
		driver.quit();

	}

}
