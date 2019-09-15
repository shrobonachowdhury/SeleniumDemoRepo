package testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenshot {

	public static void main(String args[]) throws IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		dv.manage().window().maximize();
		
		File src = ((TakesScreenshot) dv).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\admin\\Desktop\\workspace\\Test3rdAug2019\\src\\testing\\button.png"));
		
	}
	
}
