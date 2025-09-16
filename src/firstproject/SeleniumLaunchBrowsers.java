package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumLaunchBrowsers {

	public static void main(String[] args) {
		String name = "Pavithra";
		int age = 28;
		/** single line comment */
		//char gender = 'F'; 
		float percentage = 75.89f;
		
		// Hi This is Pavithra. My age is 28. UG marks is 75.89 percentage.
		System.out.println("Hi This is "+name+". My age is "+age+". UG marks is "+percentage+" percentage.");
		
		/** multi line comment */		
		
		/*int a=3;
		int b=4;
		System.out.println("Sum of a and b is "+(a+b));*/
		
		/** below code was practiced launching browsers with Selenium */
		
		//WebDriver chromedriver = new ChromeDriver();
		//chromedriver.manage().window().maximize();
		
		//WebDriver firefoxdriver = new FirefoxDriver();			
		WebDriver edgedriver = new EdgeDriver();
		//WebDriver driver = new OperaDriver();			
		//WebDriver safaridriver = new SafariDriver();


	}

}
