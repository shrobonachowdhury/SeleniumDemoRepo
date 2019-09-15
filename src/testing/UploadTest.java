package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.get("http://demo.guru99.com/test/upload/");
		dv.manage().window().maximize();
		dv.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\admin\\Desktop\\Roles and Responsibilities.docx");
	}

}
