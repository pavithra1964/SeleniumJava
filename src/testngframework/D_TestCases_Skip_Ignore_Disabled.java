package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class D_TestCases_Skip_Ignore_Disabled {
	WebDriver driver;

	@Test(priority=1)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(priority=5,enabled=false)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(priority=3)
	public void Google() {
		driver.get("https://www.google.com");
	}
	@Test(priority=2)
	public void twitter() {
		driver.get("www.x.com");
	}
	@Test(priority=6,enabled=false)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(priority=0,enabled=false)
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}
	@Ignore
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
