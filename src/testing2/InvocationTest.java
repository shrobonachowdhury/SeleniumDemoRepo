package testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationTest {
	WebDriver dv ;
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		dv.get("https://www.ebay.com/");
		dv.manage().window().maximize();
	}
	@Test(invocationCount = 10)
	public void testdropdown(){
		Select dropdown = new Select(dv.findElement(By.id("gh-cat")));
		dropdown.selectByVisibleText("Business & Industrial");
	}
	
	@AfterMethod
	public void teardown(){
		dv.quit();
	}
	
}
