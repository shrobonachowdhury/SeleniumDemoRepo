package testing2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTesting {
	WebDriver dv;
	@Test
	@Parameters({"browser","url","username","password"})
	public void login(String browser,String url,String username,String password){
		if(browser.contains("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
			dv = new ChromeDriver();
			dv.manage().window().maximize();
			dv.manage().deleteAllCookies();
		}
		else if(browser.contains("FF")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\geckodriver.exe");
			dv = new FirefoxDriver();
			dv.manage().window().maximize();
			dv.manage().deleteAllCookies();
		}
		
		dv.get(url);
		dv.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dv.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		dv.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		dv.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		dv.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
