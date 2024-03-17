package week2.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// launch url
		driver.get("http://leaftaps.com/opentaps/");
		// maxmize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Select basic checkbox

		// enter UserName
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		// enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA

		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();

		// click leads
		// a[contains(text(),'Leads')]

		driver.findElement(By.xpath("// a[contains(text(),'Leads')]")).click();

		// click create leads
		// a[contains(text(),'Create Lead')]

		driver.findElement(By.xpath("// a[contains(text(),'Create Lead')]")).click();

		// Ener company name

		// input[@id='createLeadForm_companyName']

		driver.findElement(By.xpath("// input[@id='createLeadForm_companyName']")).sendKeys(args);

		// enter first name

		// input[@id='createLeadForm_firstName']

		driver.findElement(By.xpath("// input[@id='createLeadForm_firstName']")).sendKeys(args);

		// enter last name

		// input[@id='createLeadForm_lastName']

		driver.findElement(By.xpath("// input[@id='createLeadForm_lastName']")).sendKeys(args);

		// enter FirstNameLocal

		// input[@id='createLeadForm_firstNameLocal']

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys(args);

		// enter LastNameLocal

		// input[@id='createLeadForm_lastNameLocal']

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal'")).sendKeys(args);

		// Enter Department Name

		// input[@id='createLeadForm_departmentName']

		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']'")).sendKeys(args);

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(args);

		driver.findElement(By.id("createLeadForm_description")).sendKeys(args);

		driver.close();
	}

}
