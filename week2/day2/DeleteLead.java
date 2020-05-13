package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		//driver.findElementByLinkText("Find Leads").click();
		//driver.findElement(By.xpath("//li[2]//a[2]//em[1]//span[1]//span[1]")).click();
		//driver.findElementByName("phoneNumber").sendKeys("97");
		//driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//table//tbody//tr//td//table//tbody//tr//td//em//button")).click();
		//Thread.sleep(1000);
		//System.out.println(driver.findElement(By.xpath("//tbody//td[1]//div[1]//a[1]")).getAttribute("Link Text"));
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//tbody[1]//td[1]//a[1]")).click();
		//driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10035");
		driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//table//tbody//tr//td//table//tbody//tr//td//em//button")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
		driver.close();
		
		
		
		
		
	}

}
