package week3.day2.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

	public static boolean uniqueMobPrice;

	public static boolean uniqueMobInsetOrder;

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// enter Bags in searchbox
		driver.findElement(By.name("searchVal")).sendKeys("Bags");

		// press Enter Keys
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);

		// select Gender as men

		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();

		Thread.sleep(3000);
		// select Fashion Bags from Category

		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();

		// Get the result count

		String resultCount = driver.findElement(By.xpath("//div[@class='filter']//div[1]")).getText();

		System.out.println("Search Result : " + resultCount);

		// Delcare List Array

		List<String> bagListName = new ArrayList<>();
		List<String> brandListName = new ArrayList<>();

		// Get Brand List Name

		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']//strong"));

		// Get the Bag List Name

		List<WebElement> bagList = driver.findElements(By.xpath("//div[@class='nameCls']"));

		// Add the Each Brand Name into the BrandListName ListArray

		for (WebElement eachBrand : brandList) {

			String brandName = eachBrand.getText();

			brandListName.add(brandName);
		}

		// Add the Each Bag Name into the bagListName ListArray

		for (WebElement eachbag : bagList) {

			String bagName = eachbag.getText();

			bagListName.add(bagName);
		}

		// print brand name
		System.out.println("Brand Name List " + brandListName);

		// print bag name

		System.out.println("Bag Name List " + bagListName);

	}

}