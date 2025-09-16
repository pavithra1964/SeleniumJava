package screenshots;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;

	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
								
		WebElement homelink = driver.findElement(By.xpath("//a[contains(text(),'← Go to TechLearn.in')]"));

		File f = homelink.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Pavi Testing\\Screenshots\\gotolink.png")); 
		
		
		
	/*	WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("arun"); */
		
	//	driver.findElement(By.name("username")).sendKeys("arun");
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
