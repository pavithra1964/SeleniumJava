package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class L_CrossBrowserTesting {
	public WebDriver driver;


	@Parameters({ "browser" })   
	@BeforeTest
	public void openBrowser(String browser) {

		try {

			if (browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			else if (browser.equalsIgnoreCase("Mozilla")) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();              	
			}             

			else if (browser.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
		} 
		catch (WebDriverException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void googlesearch() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Crossbrowser Testing in Selenium");
		//   Thread.sleep(5000);

	}

	@Test
	public void facebook() throws Exception {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

	}

	@Test
	public void selenium() throws Exception {

		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);

	}

	@Test
	public void googleSelenium() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Pavithra");
		Thread.sleep(2000);

	}

	@Test
	public void googletest() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Arun"+Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void googletechlearn() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("techlearn.in"+Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void googletestBeng() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Bengaluru"+Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void techlearnlogin() {	
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Tirupati");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	}


}