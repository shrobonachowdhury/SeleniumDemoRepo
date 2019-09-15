package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("https://www.toolsqa.com/");
		dv.manage().window().maximize();
		//dv.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		//dv.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement a = dv.findElement(By.xpath("//*[@id='primary-menu']/li[3]/a/span/span"));
		
		WebElement b = dv.findElement(By.xpath("//*[@id='primary-menu']/li[3]/ul/li[1]/a/span/span"));
		
		WebElement c = dv.findElement(By.xpath("//*[@id='primary-menu']/li[3]/ul/li[1]/ul/li[7]/a/span/span"));
		
		Actions action = new Actions(dv);
		Thread.sleep(3000);
		action.moveToElement(a).build().perform();
		
		action.moveToElement(b).moveToElement(c).click().build().perform();
	}
}
