package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("badrinathsakthi@gmail.com");
		driver.findElementByXPath("//div[2]//div[1]//div[1]//input[1]").sendKeys("a",Keys.TAB);
	    System.out.println(driver.findElementByXPath("//div//div//div//div[3]//div[1]//div[1]//input[1]").getAttribute("value"));
	    driver.findElementByXPath("//div[4]//div[1]//div[1]//input[1]").clear();
	    System.out.println(driver.findElementByXPath("//div[5]//div[1]//div[1]//input[1]").isEnabled());
		   	

}
}