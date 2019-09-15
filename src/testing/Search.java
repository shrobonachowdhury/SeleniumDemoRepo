package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Pune - Wikipedia')]")).click();
		String s = driver.findElement(By.id("firstHeading")).getText();
		
		if(s.equals("Pune")){
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
		driver.quit();
	}
}
