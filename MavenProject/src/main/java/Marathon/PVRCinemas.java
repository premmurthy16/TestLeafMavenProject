package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// launch url
		driver.get("https://www.pvrcinemas.com/");
		// maxmize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// select chennai
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();

		// select Cinema in Quick Book

		driver.findElement(By.xpath("//span[text()='Cinema']")).click();

		// click Cinema

		driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();

		// select PVR AEROHUB Chennai

		driver.findElement(
				By.xpath("//div[@class='p-dropdown-items-wrapper']//li[contains(text(),'PVR AEROHUB Chennai')]"))
				.click();

		// select Date

		driver.findElement(
				By.xpath("//div[@class='p-dropdown-items-wrapper']//li[contains(text(),'Tomorrow, 16 Mar')]")).click();

		// select 1st film from the list

		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]")).click();

		// select 1st timing in the dropdown list

		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]")).click();

		// click the book button

		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();

		// click the Accept Button

		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();

		// select the seat

		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();

		// print Book summary

		String bookSummay = driver.findElement(By.xpath("//div[@class='summary-movies-content']")).getText();

		System.out.println("Book Summary ");

		System.out.println(bookSummay);

		// print the Grand Total
		String gradTotal = driver.findElement(By.xpath("//div[@class='grand-prices']//h6[1]")).getText();

		System.out.println("Grad Total " + gradTotal);

		// close browser

		driver.close();

	}

}
