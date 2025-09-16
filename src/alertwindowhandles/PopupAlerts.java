package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlerts {
	WebDriver driver;

	@Test
	public void alertok() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void alertcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	@Test
	public void alertsendtextokcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
	/*	driver.switchTo().alert().sendKeys("Pavithra Murugan");
		driver.switchTo().alert().accept(); */
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Dharani");
		alt.accept();
		
	}
	
	@Test
	public void noalertwinodw() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}