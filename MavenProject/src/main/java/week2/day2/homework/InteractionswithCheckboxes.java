package week2.day2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionswithCheckboxes {

	public static void main(String[] args) {

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

		String actualToggleMsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span")).getText();

		if (expectedToggleMsg.equalsIgnoreCase(actualToggleMsg)) {

			System.out.println("Toggle Switch is On");
		}

		else {

			System.out.println("Toggle Switch is Off");
		}

	}

}
