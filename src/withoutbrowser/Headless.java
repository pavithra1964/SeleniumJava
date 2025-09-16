package withoutbrowser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Headless {
	WebDriver driver;

	@Test
	public void withoutbrowser() {

		ChromeOptions co=new ChromeOptions();
		co.addArguments("headless");
		//  co.addArguments("--headless");
		driver=new ChromeDriver(co);  

		//driver = new ChromeDriver();
		//driver.manage().window().maximize();


		driver.get("https://www.google.com/");

		String exptab = "Google";

		String acttab = driver.getTitle();
		
		System.out.println(exptab);
		Assert.assertEquals(acttab, exptab);
	}
}
