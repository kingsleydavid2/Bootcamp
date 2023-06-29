package saleforceproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteTask {

	@Test
	public void DeleteTask1() throws InterruptedException {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver(chromeOptions);
	
	//https://
	// Navigate to the demoqa website
	//https://qeagle-dev-ed.lightning.force.com/lightning/setup/SetupOneHome/home
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	//Click on toggle menu button from the left corner -
	Thread.sleep(7000);
	driver.findElement(By.xpath("//div[@class='slds-r8']")).click();
	driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	Thread.sleep(7000);
	
	
//	4. Click on Tasks tab 
//	5.Click on Dropdown icon available under tasks and select value as Recently viewed
//	6. Click the Dropdown for Bootcamp task and select Delete
//	7. Verfiy the Task is Deleted       

	
	}
	
}
