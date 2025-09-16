package iframehandling;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Iframepractice {
	WebDriver driver;

	@Test
	public void frames() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);

		WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(obj);

		//	driver.switchTo().frame(5);

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		//	driver.switchTo().parentFrame();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

}