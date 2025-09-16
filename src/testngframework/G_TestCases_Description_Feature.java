package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class G_TestCases_Description_Feature {
	WebDriver driver;

	@Test(priority=0,description = "**** Open Zomato official website *********")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(priority=3,description = "**** Open selenium official website *********")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Ignore
	@Test(priority=2,description = "**** Open google official website *********")
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(priority=1,description = "**** Open twitter official website *********")
	public void Twitter() {
		driver.get("https://www.x.com");
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
