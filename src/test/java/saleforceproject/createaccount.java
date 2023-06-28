package saleforceproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createaccount {

		@Test
		public void createaccount1() throws InterruptedException {
		
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
		//driver.findElement(By.linkText("//one-app-nav-bar-item-root/a/span[text()='Accounts']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Acc = driver.findElement(By.xpath("//one-app-nav-bar-item-root/a/span[text()='Accounts']"));
				
		js.executeScript("arguments[0].click();", Acc);
						
		//xpath("//span[normalize-space()='Accounts']")).click();
		driver.findElement(By.xpath("//a[@title='New']/div")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("stalin6790");
		//js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div")));
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div")));
		driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		//String actualTitle = null;
		//String expectedTitle = "Avinash Mishra Blogger: Learn Selenium WebDriver, ";
		//Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		
		String av= driver.findElement(By.xpath("//div[@role=\"alertdialog\"]//following-sibling::div//div/div/span")).getText();
        System.out.println(av);
        
        Assert.assertEquals(av, "Account \"stalin6790\" was created.");
		
		
		//Click view all and click salce from app lancher
		
	}
	
	
		

}
