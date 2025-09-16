package pagescrolldownandscrollup;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrolldownandScrollup {
	WebDriver driver;
	@Test
	public void scrolldown() throws InterruptedException {
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,3900)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
		jse.executeScript("scroll(1000,0)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@Test 
    public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
   {
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
      }
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
