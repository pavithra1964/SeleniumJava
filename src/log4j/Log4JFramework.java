package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4JFramework {
	WebDriver driver;
	@Test
	public void loginmodule() {
		Logger log= Logger.getLogger("Techlearn module");
		PropertyConfigurator.configure("Log4j.properties");
		driver = new ChromeDriver();
		log.info("Chrome Browser launched");

		driver.manage().window().maximize();
		log.info("Chrome Browser maximize");

		driver.get("https://www.techlearn.in/wp-login.php");
		log.info("Login page opened");

		driver.findElement(By.id("user_login")).sendKeys("Pavithra");
		log.info("Username entered");

		driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		log.info("password entered");

		driver.findElement(By.id("rememberme")).click();
		log.info("cliked remberme");

		driver.findElement(By.name("wp-submit")).click();
		log.info("login button cliked");
	}
}
