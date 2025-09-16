package locators;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumLocators {
	WebDriver driver;
	
	 @Test
	 public void idnameclassname() throws InterruptedException {
		  driver.get("http://techlearn.in/admin");
		  Thread.sleep(2000);
		  driver.findElement(By.id("user_login")).sendKeys("pavithra");
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		  Thread.sleep(2000);
		  driver.findElement(By.id("rememberme")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.className("wp-login-lost-password")).click();
	 }
	 @Test
		public void cssSelectorPractice() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(2000);
		//	driver.findElement(By.cssSelector("input#user_login")).sendKeys("Murugan");
			driver.findElement(By.cssSelector("#user_login")).sendKeys("Murugan");
			Thread.sleep(2000);
			
		//	driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
			driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
			
		}
	  	@Test
		public void linktextpartiallinktextpractice() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(3000);
		//	driver.findElement(By.linkText("Lost your password?")).click();
			driver.findElement(By.partialLinkText("Lost")).click();
			
		}
		
		
		@Test
		public void returntypesofelements() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(3000);
			
			WebElement user = driver.findElement(By.id("user_login"));
			user.sendKeys("Kanchi");
			
			WebElement check = driver.findElement(By.name("rememberme"));
			check.click();
		}
		
		
		@Test
		public void totalnumberoflinks() throws InterruptedException {
			driver.get("https://www.ndtv.com");
			Thread.sleep(3000);
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("Total links on ndtv home application : "+links.size());
			System.out.println(links.size());
		}
		
		
		@Test
		public void totalnumberofimages() throws InterruptedException {
			driver.get("https://www.redmine.org");
			Thread.sleep(3000);
			
			List<WebElement> images = driver.findElements(By.tagName("img"));
			System.out.println("Total number of  images in redmine: "+images.size());
		
		}
		@Test
		public void totalnumberofimagestech() throws InterruptedException {
			driver.get("https://www.techlearn.in");
			Thread.sleep(3000);
			
			List<WebElement> images = driver.findElements(By.tagName("img"));
			System.out.println("Total number of  images in techlearn: "+images.size());
		
		}
		@Test
		public void xpathpractice() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("Pavithra");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Pwd@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/form/p[2]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
			
		
		}

	 
	 @BeforeTest
	 public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	 }


}
