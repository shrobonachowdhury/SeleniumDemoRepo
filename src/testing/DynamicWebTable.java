package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://classic.crmpro.com/");
		dv.manage().window().maximize();
		
		dv.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dv.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		dv.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		dv.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		dv.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		dv.switchTo().frame("mainpanel");
		dv.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		dv.findElement(By.xpath("//a[contains(text(),'3Deb 3Kyle')]/parent::td//preceding-sibling::td/input[@name='contact_id']")).click();
		
	}
}
