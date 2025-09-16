package verifytabtitleurltext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitleURLAndText {
	WebDriver driver;

	@Test
	public void verifytabtitle() {
		driver.get("https://www.google.com");
		
		String exptabtext = "Google";
		System.out.println("Expected tab title is :"+exptabtext);
		
		String acttabtext = driver.getTitle();
		System.out.println("Actual tab title is :"+acttabtext);
		
		Assert.assertEquals(acttabtext, exptabtext);
	}
	
	
	@Test
	public void verifyapplicationurl() {
		driver.get("https://www.techlearn.in/");
		
		String expurl = "https://www.techlearn.in/";
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
	
	}
	
	@Test
	public void verifyapplicationtext() {
		driver.get("https://www.google.com");
		
		String expgtext = "Gmail";
		String actgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).getText();
		Assert.assertEquals(actgtext, expgtext);
		
		String expimgtext = "Images";
		String actimgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Images')]")).getText();
		Assert.assertEquals(actimgtext, expimgtext);
		
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
