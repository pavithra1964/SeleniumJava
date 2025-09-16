package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class H_TestCases_Run_MultipleTimes {
	WebDriver driver;

	@Test(invocationCount=2)
	public void method1() {	
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Tirupati");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	}
	
	@Test
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
