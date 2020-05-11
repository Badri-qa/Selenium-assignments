package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Photon Interactive");
		driver.findElementById("createLeadForm_firstName").sendKeys("Badri");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		//driver.findElementByName("submitButton").click();
		
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Partner");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Cold Call");
		
		
		WebElement a = driver.findElementById("createLeadForm_marketingCampaignId");
		Select b = new Select(a);
		b.selectByValue("CATRQ_CARNDRIVER");
		
		WebElement c = driver.findElementById("createLeadForm_industryEnumId");
		Select d = new Select(c);
		d.selectByIndex(16);
		
		WebElement e = driver.findElementById("createLeadForm_ownershipEnumId");
		Select f = new Select(e);
		f.selectByVisibleText("Corporation");
		
		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
		
		driver.findElementByName("submitButton").click();
		
		//Thread.sleep(5000);
		//driver.close();
		

	}

}
