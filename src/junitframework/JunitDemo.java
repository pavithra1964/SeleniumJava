package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
	//@Disabled
	@Test
	void zomato() {
		driver.get("https://www.zomato.com");	
	} 
	//@Disabled
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");		
	}
	//@Disabled
	@Test
	void gmail() {
		driver.get("https://www.gmail.com");		
	}
	@Test
	void swiggy() {
		driver.get("https://www.swiggy.com");		
	}
	//@Disabled
	@Test
	void techlearn() {
		driver.get("https://www.techlearn.in");	
	}
	@Test
	void seleniumlearn() {
		driver.get("https://www.seleniumlearn.com");	
	}
	//@Ignore
	@Test
	void redmine() {
		driver.get("www.redmine.org");	
	}

}
