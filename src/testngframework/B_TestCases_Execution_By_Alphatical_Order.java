package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class B_TestCases_Execution_By_Alphatical_Order {
	WebDriver driver;

	@Test
	public void Zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void Selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@BeforeTest
	public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	}

}
