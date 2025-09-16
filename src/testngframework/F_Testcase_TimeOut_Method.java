package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class F_Testcase_TimeOut_Method {
	WebDriver driver;

	@Test
	public void techlearnlogin() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Tirupati");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	}

	@Test(timeOut = 10000)
	public void techlearnmenus() {
		driver.get("https://www.happycow.net/");
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-11\"]//*[@id=\"full-site-content\"]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"full-site-content\"]/div[1]/nav/div/div[2]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"full-site-content\"]/div[1]/nav/div/div[2]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"full-site-content\"]/div[1]/nav/div/div[2]/ul[1]/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"full-site-content\"]/div[1]/nav/div/div[2]/ul[1]/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"full-site-content\"]/div[1]/nav/div/div[2]/ul[1]/li[7]/a")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
