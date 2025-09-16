package dropdownselection;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownValues {
	WebDriver driver;

	@Test
	public void selectdropdown() throws InterruptedException {
		driver.get("https://www.redmine.org");
		driver.findElement(By.xpath("//a[@class='register']")).click();
		driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("pavithra123@gmail.com");
		Thread.sleep(2000);
		
		Select lan = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		//lan.selectByVisibleText("Spanish (Español)");
		//lan.selectByValue("fr");
		//lan.selectByIndex(7);
		lan.selectByContainsVisibleText("Th");
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
