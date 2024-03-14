package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("email")).sendKeys("prem.murthy16@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(3000);
		
		
		
	}

}
