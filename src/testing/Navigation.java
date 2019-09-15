package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.manage().window().maximize();
		dv.get("http://www.google.com");
		dv.navigate().to("http://www.amazon.com");
		dv.navigate().back();
		dv.navigate().forward();
		dv.navigate().back();
		dv.navigate().refresh();
		dv.quit();
	}
}
