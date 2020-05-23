package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElement(By.xpath("(//a[@onclick='return false;'])[5]/following::span[@class='x-tab-strip-text ']")).click();
		driver.findElementByName("emailAddress").sendKeys("badri24793@gmail.com");
		driver.findElement(By.xpath("//input[@name='emailAddress']/following::button")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElementByLinkText("badri").getText());
		driver.findElementByLinkText("badri").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		System.out.println("The title is displayed as Duplicate Lead= " + driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).isDisplayed());
		driver.findElementByName("submitButton").click();
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
