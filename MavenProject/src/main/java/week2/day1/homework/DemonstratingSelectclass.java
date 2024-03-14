package week2.day1.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectclass {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// Launch Url
		driver.get("https://en-gb.facebook.com/");
		// Maximize window
		driver.manage().window().maximize();
		// driver wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		// click create account Button
		driver.findElement(By.partialLinkText("Create new account")).click();
		// Enter First Name
		driver.findElement(By.name("firstname")).sendKeys("Premkumar");
		// Enter Surname
		driver.findElement(By.name("lastname")).sendKeys("Murthy");
		// Eneter Email Id
		driver.findElement(By.name("reg_email__")).sendKeys("premmurthy123@mailinator.com");
		// Enter Confirm Email Id
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("premmurthy123@mailinator.com");
		// Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Testmailaccout@123");
		// Select Day
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("5");
		// Select month
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		// Select Year
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2018");
		// Click Male Gender
		driver.findElement(By.xpath("//label[contains(text(),'Male')]/following-sibling::input")).click();
		// Click Sign Up Button
		driver.findElement(By.name("websubmit")).click();

		driver.close();

	}

}
