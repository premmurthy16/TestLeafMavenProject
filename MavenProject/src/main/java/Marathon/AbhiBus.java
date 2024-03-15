package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// launch url
		driver.get("https://www.abhibus.com/");
		// maxmize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From Station']")));

		// enter from station as chennai
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");

		// select the station from Chennai from dropdown

		driver.findElement(
				By.xpath("//div[@class='container auto-complete-drop-down ']//div[contains(text(),'Chennai')][1]"))
				.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To Station']")));

		// Enter the To Station as Bangalore

		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");

		// select the station from Bangalore from dropdown
		driver.findElement(
				By.xpath("//div[@class='container auto-complete-drop-down ']//div[contains(text(),'Bangalore')][1]"))
				.click();
		// click Tomorrow Button

		driver.findElement(By.xpath("//button[contains(text(),'Tomorrow')]")).click();

		Thread.sleep(3000);

		// click the search Button

		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();

		// Thread.sleep(3000);
		// get First Name of the Bus Service

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//div[@id='service-cards-container']//div[contains(@id,'service-operator-agent-name')]/h5[1]")));
		String firstBugServiceName = driver
				.findElement(By.xpath(
						"//div[@id='service-cards-container']//div[contains(@id,'service-operator-agent-name')]/h5[1]"))
				.getText();

		System.out.println("First Bus Service Name in the List is  " + firstBugServiceName);

		// select the sleeper bus type

		driver.findElement(By.xpath("//p[text()='Bus Type']/following::span[text()='Seater']")).click();

		// verify the total bus count

		String totalAvailableSeat = driver.findElement(By.xpath("//div[@class='text-grey']//small[1]")).getText();

		System.out.println(totalAvailableSeat);

		// click show seats

		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='seat']//span")));

		// select seat

		driver.findElement(By.xpath("//span[text()='3']")).click();

		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();

// get seat info
		String selectedSeat = driver.findElement(By.xpath("//span[contains(text(),'Seat Selected :')]")).getText();
//get fare info
		String baseFare = driver.findElement(By.xpath("//span[contains(text(),'Base Fare :')]")).getText();
		// print seat and fare info
		System.out.println(selectedSeat + " & " + baseFare);
//print page tiltle
		System.out.println("Page Title : " + driver.getTitle());

		driver.close();

	}

}
