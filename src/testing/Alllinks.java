package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String args[]){
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
	
	WebDriver dv = new ChromeDriver();
	
	dv.get("https://www.ebay.com/");
	dv.manage().window().maximize();
	
	List <WebElement> list = dv.findElements(By.tagName("a"));
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getText());
	}
	}
	}
