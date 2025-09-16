package techlearn;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GooglSearch {
	WebDriver driver;

	@Test
	public void google() {	
		driver.findElement(By.name("q")).sendKeys("Dharani");;
	}
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
