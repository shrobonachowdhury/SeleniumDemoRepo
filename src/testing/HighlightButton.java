package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightButton {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://classic.crmpro.com/");
		dv.manage().window().maximize();
		
		WebElement a = dv.findElement(By.xpath("//input[@value='Login']"));
		
		flash(a,dv);
		
	}
	
	
	
	public static void flash(WebElement element,WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 1 ;i<10;i++){
			
			changecolor("rgb(0,200,0)",element,driver);
			changecolor(bgcolor,element,driver);
		}
		
	}
	
	public static void changecolor(String color,WebElement element,WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver ; 
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'" ,element);
	
		try{
			Thread.sleep(20);
		}catch(InterruptedException e){
	
	}
}
}