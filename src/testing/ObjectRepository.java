package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepository {

	static WebDriver dv;
	public static void main(String args[]) throws IOException{
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\admin\\Desktop\\workspace\\Test3rdAug2019\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		
		String s = prop.getProperty("browser");
		
		if(s.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
			dv = new ChromeDriver();
			dv.manage().window().maximize();
		}
		else if (s.equals("FF")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\geckodriver.exe");
			dv = new FirefoxDriver();
			dv.manage().window().maximize();
		}
		
	dv.get(prop.getProperty("url"));	
	dv.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname_value"));
	dv.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname_value"));
	dv.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("email_value"));
	dv.findElement(By.xpath(prop.getProperty("confirm_xpath"))).sendKeys(prop.getProperty("confirm_value"));
	dv.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
	
	
	}
}
