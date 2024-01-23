package jenkins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ajioTest {

	@Test
	public void PerfumeTest()
	{
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.ajio.com/");
		WebElement stf= d.findElement(By.name("searchVal"));
		stf.sendKeys("wallets");
		stf.sendKeys(Keys.ENTER);
		Assert.assertEquals("gampu", "hritika");
		System.out.println("hii my name is chimki");

	}

}
