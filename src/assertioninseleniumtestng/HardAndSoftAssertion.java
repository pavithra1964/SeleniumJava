package assertioninseleniumtestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertion {
	@Test
	public void HardAssert() {
		System.out.println("Test started");
		Assert.assertEquals("Hello", "Hi");  // fails
		System.out.println("This will not execute");
	}
	@Test
	public void SoftAssert() {
		SoftAssert softAssert = new SoftAssert();

		System.out.println("Test started");
		softAssert.assertEquals("Hello", "Hi");  // fails but continues
		System.out.println("This will still execute");

		softAssert.assertAll();  // reports all failures
		
	}

}
