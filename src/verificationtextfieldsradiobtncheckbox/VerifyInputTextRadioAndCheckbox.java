package verificationtextfieldsradiobtncheckbox;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyInputTextRadioAndCheckbox {
	WebDriver driver;

	@Test
	public void isDisplayedMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();
		
		if(lyp==true)
		{
			System.out.println("Lost your password text is visible for click");
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		}
		else
		{
			System.out.println("Lost your password text is Not available for click");
		
		}
	}
	
	@Test
	public void isEnabledMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		boolean username = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();
		
		if(username==true)
		{
			System.out.println("Username text box is enabled to the enter username or email id");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Pavithra Murugan");
		}
		else
		{
			System.out.println("Username text box is Not enabled to the enter username or email id");		
		}
	}
	
	@Test
	public void isSeletedMethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		
		boolean checkbox = driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("Checkbox is Selected");
		}
		else
		{
			System.out.println("Checkbox is Not Selected");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
