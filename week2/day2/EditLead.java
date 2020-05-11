package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	
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
		driver.findElementByXPath("//div[@class='x-tab-panel-bwrap']//div[2]//div[1]//input[1]").sendKeys("badri");
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-panel-footer x-panel-footer-noborder']//button[@class='x-btn-text']").click();
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//tbody[1]//td[1]//a[1]")).click();
		System.out.println(driver.getTitle());	
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Photon");
		driver.findElementByName("submitButton").click();
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
