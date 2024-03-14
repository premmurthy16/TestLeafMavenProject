package week2.day2.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionswithCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// launch url
		driver.get("https://leafground.com/checkbox.xhtml");
		// maxmize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Select basic checkbox
		driver.findElement(
				By.xpath("//span[contains(text(),'Basic')]/preceding-sibling::div[contains(@class,'ui-chkbox-box')]"))
				.click();

		// span[contains(text(),'Basic')]/preceding-sibling::div[contains(@class,'ui-chkbox-box')]

		// div[contains(@class,'ui-chkbox-box ui-widget')]
		// select the Ajax checkbox

		driver.findElement(
				By.xpath("//span[contains(text(),'Ajax')]/preceding-sibling::div[contains(@class,'ui-chkbox-box')]"))
				.click();

		//// span[contains(text(),'Ajax')]/preceding-sibling::div[contains(@class,'ui-chkbox-box')]
		// verify the verify message

		String expectedAjaxCheckboxMsg = "Checked";
		String actualAjaxCheckboxMsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span")).getText();

		if (expectedAjaxCheckboxMsg.equalsIgnoreCase(actualAjaxCheckboxMsg)) {

			System.out.println("Notification Ajax Checkbox is Selected");
		} else {

			System.out.println("Notification Ajax Checkbox is not Selected");
		}

		// select the favorite language as Java

		driver.findElement(By.xpath(
				"//h5[text()='Choose your favorite language(s)']/following::div[contains(@class,'ui-chkbox-box ui-widget')][1]"))
				.click();

		driver.findElement(By.xpath(
				"//h5[text()='Choose your favorite language(s)']/following::div[contains(@class,'ui-chkbox-box ui-widget')][2]"))
				.click();
		// select the Tri-State Checkbox
		driver.findElement(By.xpath(
				"//h5[text()='Tri State Checkbox']/following::div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']"))
				.click();

		// verify the Tri State selected
		String stateValue = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();

		System.out.println("stateValue " + stateValue);

		String expectedstateValue = "State = 1";

		if (stateValue.equalsIgnoreCase(expectedstateValue)) {

			System.out.println("Tri State Checkbox is Selected");
		}

		else {

			System.out.println("Tri State Checkbox is not Selected");
		}
//Toggle On the switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']//div[@class='ui-toggleswitch-slider']"))
				.click();

		// verify the toggle message

		String expectedToggleMsg = "Checked";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[@class='ui-growl-message']//span"))));
		String actualToggleMsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span")).getText();

		if (expectedToggleMsg.equalsIgnoreCase(actualToggleMsg)) {

			System.out.println("Toggle Switch is On");
		}

		else {

			System.out.println("Toggle Switch is Off");
		}

		// verify if checkbox disbaled

		if (driver.findElement(By.xpath(
				"//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"))
				.isEnabled() == true) {

			System.out.println("check box is disabled");

		} else {
			System.out.println("check box is not disabled");

		}

		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]"))
				.click();

		List<WebElement> list = driver.findElements(By.xpath(
				"//li[contains(@class,'ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item')]//div/div/following-sibling::div"));

		for (int i = 0; i < list.size(); i++) {

			list.get(i).click();

			Thread.sleep(20);

		}

		// close the selection dropdown

		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();

		// print the selected County Name

		List<WebElement> nameList = driver.findElements(By.xpath(
				"//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']//li"));

		System.out.print("Following Countries are selected ");
		for (int i = 0; i < nameList.size(); i++) {

			String contryName = nameList.get(i).getText();

			System.out.print(" " + contryName);

		}

		driver.close();
	}

}
