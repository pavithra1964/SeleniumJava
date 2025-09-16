package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class I_TestCases_Execution_XML_File_or_Suite_File {
	WebDriver driver;

	@Test
	public void Zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void Happycow() {
		driver.get("https://www.happycow.net/");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void filpkart() {
		driver.get("https://www.filpkart.com");
	}
	@Test
	public void tech() {
		driver.get("https://www.techlearn.in");
	}
	
	@BeforeTest
	public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	}

}
