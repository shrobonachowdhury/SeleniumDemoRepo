package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main (String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		ChromeDriver dv = new ChromeDriver(options);
		
		dv.get("http://www.google.com");
		dv.manage().window().maximize();
		dv.findElement(By.xpath("//input[@title='Search']")).sendKeys("kolkata");
		Thread.sleep(2000);
		dv.findElement(By.xpath("//input[@value='Google Search']")).click();
		System.out.println("PASS");
		
	}
}
