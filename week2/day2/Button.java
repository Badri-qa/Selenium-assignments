package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://www.leafground.com/pages/radio.html");
		//driver.findElementById("yes").click();
		//System.out.println(driver.findElementByXPath(" //label[3]//input[1]").isEnabled());
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.findElementByXPath("//div[contains(text(),'Java')]//input").click();
		driver.findElementByXPath("//div[contains(text(),'VB')]//input").click();
		System.out.println(driver.findElementByXPath("//div[contains(text(),'VB')]//input").isSelected());
		driver.findElementByXPath("//div[contains(text(),'I am Selected')]//input").click();
		driver.findElementByXPath("//div[contains(text(),'Option 1')]//input").click();
		driver.findElementByXPath("//div[contains(text(),'Option 2')]//input").click();
		driver.findElementByXPath("//div[contains(text(),'Option 3')]//input").click();
		driver.findElementByXPath("//div[contains(text(),'Option 4')]//input").click();
		driver.findElementByXPath("//div[contains(text(),'Option 5')]//input").click();
	}

}
