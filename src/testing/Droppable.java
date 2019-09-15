package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("https://jqueryui.com/droppable/");
		dv.manage().window().maximize();
		
		dv.switchTo().frame(0);
		
		WebElement a = dv.findElement(By.id("draggable"));
		
		WebElement b = dv.findElement(By.id("droppable"));
		
		Actions action = new Actions(dv);
		
		action.clickAndHold(a).moveToElement(b).release(a).build().perform();
	}
}
