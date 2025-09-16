package newtabsandnewwindow;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class SwithtoTabsandWindows {
	WebDriver driver;

	@Test
	public void tabswitch() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(1000);
		

		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("scroll(0,500)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Download Selenium Jars']")).click();
		Thread.sleep(2000);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
	}
	@Test
	public void createnewtabandwindow() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(1000);
		
	//	driver.switchTo().newWindow(WindowType.TAB);     
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
	}
	
	@Test
	public void techlearnnewtab() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);

		// driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.selenium.dev");

		// driver.close();
		Thread.sleep(2000);

	/* 	Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[1].toString()); */


		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(2000);
		
		Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[0].toString()); 

		driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}