package week2.day1.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateAccount.
 */
public class CreateAccount {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// Launch Url
		driver.get(" http://leaftaps.com/opentaps/");
		// Maximize Window
		driver.manage().window().maximize();
		// enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Enter Pwd
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Premkumar");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		Select ind = new Select(driver.findElement(By.name("industryEnumId")));

		ind.selectByVisibleText("Computer Software");

		Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));

		ownership.selectByVisibleText("S-Corporation");

		Select source = new Select(driver.findElement(By.id("dataSourceId")));

		source.selectByValue("LEAD_EMPLOYEE");

		Select marketingCampaign = new Select(driver.findElement(By.id("marketingCampaignId")));

		marketingCampaign.selectByIndex(6);

		Select StateProvince = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));

		StateProvince.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();

		String expectedPageTitle = "Account Details | opentaps CRM";

		String actualPageTitle = driver.getTitle();

		String accountName = driver.findElement(By.xpath("//td[@class='titleCell']/following-sibling::td/span"))
				.getText();
		// Verify the PageTile and Account Name
		if ((actualPageTitle.equalsIgnoreCase(expectedPageTitle)) && accountName.contains("Premkumar")) {

			System.out.println("Account Created Sucessfully");

		}

		else {

			System.out.println("Unable to Create the Account");
		}

		driver.close();
	}

}
