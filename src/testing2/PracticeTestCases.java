package testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PracticeTestCases {
	WebDriver dv ;
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		dv.get("http://www.google.com");
		dv.manage().window().maximize();
	}
	
	@Test(priority=1,groups="title")
	public void testtitle(){
		String title = dv.getTitle();
		
		Assert.assertEquals(title,"Google","title is not matched");
	}
	
	@Test(priority=3,groups="pagedisplay")
	public void logotest(){
		boolean b= dv.findElement(By.id("hplogo")).isDisplayed();
		
		Assert.assertTrue(b);
	}
	
	@Test(priority=2,groups="pagedisplay")
	public void linktest(){
		boolean c = dv.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(c);
	}
	
	@AfterMethod
	public void teardown(){
		dv.quit();
	}
}
