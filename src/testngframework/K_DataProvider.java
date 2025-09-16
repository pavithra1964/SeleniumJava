package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class K_DataProvider {
	WebDriver driver;

	@DataProvider(name = "datainput")
	public String[][] login() {
		return new String[][] { 
			{ "pavithra@gmail.com", "Hello@123"}, 
			{ "murugan", "9000109120" },
			{ "chennai", "ABCDEF" },
			{ "kanchi", "123456789" },
			{ "naveen", "ABCDEFGHI" },
			{ "arijit", "Selenium@2025"}
		};
	}

	@Test(dataProvider = "datainput")
	public void login(String user, String password) throws Exception {

		driver.get("https://www.semivlsi.com/wp-login.php");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		try 
		{
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"))).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
			System.out.println("PASS");
		} 
		catch (Exception e) 
		{		
			System.out.println("FAIL");
			//	System.out.println("Exception due to: "+e);
		}
	}

	@BeforeTest
	public void beforeTest() {			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}