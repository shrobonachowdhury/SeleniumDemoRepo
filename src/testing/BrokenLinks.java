package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String args[]) throws InterruptedException, MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		
		dv.manage().window().maximize();
		dv.manage().deleteAllCookies();
		dv.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		dv.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		dv.get("https://classic.crmpro.com");
		dv.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		dv.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
		dv.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		dv.switchTo().frame("mainpanel");
		
		dv.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		List <WebElement> list = dv.findElements(By.tagName("a"));
		list.addAll(dv.findElements(By.tagName("img")));
		
		System.out.println("total number of links:"+list.size());
		
		List <WebElement> activelinks = new ArrayList <WebElement>();
		
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i).getAttribute("href"));
			if(list.get(i).getAttribute("href")!= null && (!list.get(i).getAttribute("href").contains("javascript"))){
				activelinks.add(list.get(i));
				
			}
		}
		System.out.println("number of activelinks:"+activelinks.size());
		
		
		for(int j=0;j<activelinks.size();j++){
			
			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+"----->"+response);
		}
	}
	
}
