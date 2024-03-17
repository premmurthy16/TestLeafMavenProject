package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// launch url
		driver.get("https://www.amazon.in/");
		// maxmize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));

		// enter Bags for Boys in text box

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");

		// select the Bags for Boys

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction'][1]")));

		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction'][1]")).click();

		// print the result set

		String result1 = driver
				.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[1]"))
				.getText();

		String result2 = driver
				.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[3]"))
				.getText();

		System.out.println(result1 + " " + result2);

		// select the brands

		// driver.findElement(By.xpath("//i[@class='a-icon
		// a-icon-checkbox'])[3]")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")));

		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();

		/*
		 * wait.until(ExpectedConditions .elementToBeClickable(By.xpath(
		 * "(//li[@id='p_123/2037']/span[1]/a[1]/div[1]/label[1]/i[1]")));
		 *
		 * driver.findElement(By.xpath(
		 * "//li[@id='p_123/2037']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
		 */

		// select last 30 days sort

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Last 30 days']")));

		driver.findElement(By.xpath("//span[text()='Last 30 days']")).click();

		// Get the First Brand Bag Name

		String brandName = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();

		String discountPricedetail = driver
				.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();

		// print the first listed bag detail

		System.out.println(brandName);

		System.out.println(discountPricedetail);

		// close browser

		// driver.close();

	}

}
