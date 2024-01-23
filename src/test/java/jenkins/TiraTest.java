package jenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.listenerImplementation;

@Listeners(listenerImplementation.class)
public class TiraTest {

	@Test
	public void perfumeTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		d.get("https://www.tirabeauty.com/");
		Assert.assertEquals("pune", "deccan");     // how to fail the testsvript
		
	}
		@Test    //(dependsOnMethods = "perfumeTest")  to skip the test case
		public void myntraTest()
		{
			WebDriver d = new ChromeDriver();
		//	d.manage().window().maximize();
			d.get("https://www.myntra.com/");
		//	Assert.assertEquals("pune", "deccan");     // how to fail the testsvript

		}

}
