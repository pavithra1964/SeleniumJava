package withoutbrowser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTestGit {
	WebDriver driver;
  @Test
  public void techlearn() {
	  driver.get("https://techlearn.in/admin");
	  Thread.sleep(2000);
		  driver.findElement(By.id("user_login")).sendKeys("Dharani");
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		  Thread.sleep(2000);
		  driver.findElement(By.id("rememberme")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.className("wp-login-lost-password")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
