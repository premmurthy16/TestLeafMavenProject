package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileSetImplementation {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");

		driver.findElement(By.xpath("//div[text()='mobile']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		List<String> mobilePrice = new ArrayList<>();

		for (WebElement each : list) {

			String mobPrice = each.getText();

			mobilePrice.add(mobPrice);

		}

		System.out.println("Mobile " + mobilePrice);

	}
}