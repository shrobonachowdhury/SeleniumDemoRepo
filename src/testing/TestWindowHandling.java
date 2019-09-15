package testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandling {

	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("http://demo.guru99.com/popup.php");
		dv.manage().window().maximize();
		
		dv.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		String mainwindow = dv.getWindowHandle();
		
		Set <String>s = dv.getWindowHandles();
		
		Iterator <String>it = s.iterator();
		
		while(it.hasNext()){
		String childwindow = it.next();
		
		if(!mainwindow.equalsIgnoreCase(childwindow)){
			dv.switchTo().window(childwindow);
			dv.findElement(By.xpath("//input[@name='emailid']")).sendKeys("shrobona@gmail.com");
			dv.findElement(By.xpath("//input[@value='Submit']")).click();
			dv.close();
		}
		dv.switchTo().window(mainwindow);
		
		}
		dv.quit();
	}
}
