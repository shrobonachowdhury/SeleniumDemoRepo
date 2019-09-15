package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("http://demo.guru99.com/test/delete_customer.php");
		dv.manage().window().maximize();
		
		
		
		dv.findElement(By.xpath("//input[@name='cusid']")).sendKeys("4545");
		dv.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alert = dv.switchTo().alert();
		alert.accept();
		
		System.out.println(alert.getText());
		
		
		
		
	}
}
