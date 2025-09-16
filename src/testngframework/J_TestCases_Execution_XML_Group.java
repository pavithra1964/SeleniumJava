package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class J_TestCases_Execution_XML_Group {
	WebDriver driver;

	@Test(groups="ai")
	public void grok() {
		driver.get("https://www.grok.com/");
	}
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(groups={"tech", "tool"})
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(groups="search")
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test(groups="ai")
	public void chatgpt() {
		driver.get("https://www.chatgpt.com");
	}
	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(groups={"training","tool"})
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}	
	@Test(groups={"tech","tool"})
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(groups="ai")
	public void deepseek() {
		driver.get("https://www.deepseek.com/");
	}
	@Test(groups="email")
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	@Test(groups="tech")
	public void seleniumlearn() {
		driver.get("https://www.seleniumlearn.com");
	}	
	@BeforeTest(groups="tool")
	public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	}

}
