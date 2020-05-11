package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		//driver.findElementByLinkText("Go to Home Page").click();
		System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
		driver.findElementByLinkText("Verify am I broken?").click();
	    System.out.println(driver.getTitle());
	    driver.close();

	}

}
