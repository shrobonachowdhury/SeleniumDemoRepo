package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("https://www.ebay.com/");
		dv.manage().window().maximize();
		
		Select dropdown = new Select(dv.findElement(By.id("gh-cat")));
		
		dropdown.selectByVisibleText("Cell Phones & Accessories");
	}
}
