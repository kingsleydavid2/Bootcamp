package saleforceproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIndividuals {

	@Test
	public void DeleteIndividuals1() throws InterruptedException {
	
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
	
	//driver.findElement(By.xpath("//p[text()='Sales']")).click();
	Thread.sleep(7000);
	
	
//	4. Click on the Individuals tab 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//p[normalize-space()='Individuals']")));
	driver.findElement(By.xpath("//p[normalize-space()='Individuals']")).click();
	
	Thread.sleep(4000);
	
//	5. Search the Individuals 'Kumar'
	driver.findElement(By.xpath("//input[@name='Individual-search-input']")).click();
	
	driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys("Kumar");
	
	driver.findElement(By.xpath("//div[contains(@class,'inlineEdit--disabled keyboardMode--inactive inlineEditGrid forceInlineEditGrid')]")).click();
	
	//driver.findElement(By.xpath("//input[@name='Individual-search-input']")).click();
	
	Thread.sleep(7000);
	
	//driver.findElement(By.xpath("//a[contains(@title,'Show 2 more actions')]")).click();
	
	driver.findElement(By.xpath("//tbody/tr[7]/td[6]/span[1]/div[1]/a[1]/span[1]/span[1]")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[@title='Delete']")).click();
	
	
	//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/span[1]/div[1]/a[1]/span[1]/span[1]")).click();
	
	//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/div[1]/a[1]/span[1]/span[1]")).click();
//	6. Click on the Dropdown icon and Select Delet
	
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
	
	//Thread.sleep(7000);
	
	//String av= driver.findElement(By.xpath("//div[@role=\"alertdialog\"]//following-sibling::div//div/div/span")).getText();
	String av= driver.findElement(By.xpath("//div[@aria-label='Success']")).getText();
    System.out.println(av);
    
     
  //span[@class='toastMessage slds-text-heading--small forceActionsText']
    
    Assert.assertEquals(av, "Success "
    		+ "Individual \"Kumar\" was deleted. Undo "
    		+ "Close");
    
    
	
	//div[@aria-label='Success']
	
	//driver.findElement(By.xpath("//span[normalize-space()='Delete']"));
	
//	7.Click on the Delete option in the displayed popup window.
//	8. Verify Whether Individual is Deleted using Individual last name                                                    

	
	}
}

