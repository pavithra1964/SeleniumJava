package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class C_TestCases_Execution_By_Priority_Order {
	WebDriver driver;

	@Test(priority=1)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(priority=5)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(priority=3)
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(priority=2)
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test(priority=6)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(priority=0)
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}
	@Test(priority=4)
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
