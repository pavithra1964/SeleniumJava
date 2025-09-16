package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowserMethods {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize(); // Selenium 4 version only available in minimize
		Thread.sleep(3000);
		driver.manage().window().fullscreen();  // Selenium 4 version only available in fullscreen
		Thread.sleep(3000);
		driver.close();
		driver.quit();;


	}

}
