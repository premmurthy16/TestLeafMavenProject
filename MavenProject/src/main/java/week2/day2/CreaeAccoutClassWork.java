package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreaeAccoutClassWork {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		// Create Lead
		// click on createlead link
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		// enter companyname
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf1");
		// enter firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Premkumar");
		// enter lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");

		WebElement sourceDD = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(3);

		// select marketcampaign by using text
		WebElement mCDD = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select sec1 = new Select(mCDD);
		sec1.selectByVisibleText("eCommerce Site Internal Campaign");

		// select by value for industry dd
		WebElement inDD = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select sec2 = new Select(inDD);
		sec2.selectByValue("IND_MEDIA");

		// click submitbutton
		driver.findElement(By.name("submitButton")).click();
		// print the title
		System.out.println(driver.getTitle());

		// close the browser
		// driver.close();

	}

}
