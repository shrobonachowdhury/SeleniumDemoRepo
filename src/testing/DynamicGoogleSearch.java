package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("http://www.google.com");
		dv.manage().window().maximize();
		
		dv.findElement(By.xpath("//input[@title='Search']")).sendKeys("windows");
		Thread.sleep(2000);
		
		List <WebElement>list = dv.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("windows 10 pro product key")){
				list.get(i).click();
				break;
			}
		}
	}
}
