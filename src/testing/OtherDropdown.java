package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherDropdown {

	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		
		dv.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		dv.manage().window().maximize();
		
		dv.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List <WebElement>list = dv.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
	
		for (int i=0;i<list.size();i++){
			
			if(list.get(i).getText().contains("Bootstrap")){
				list.get(i).click();
				break;
			}
			
			
			
		}
	}
	
}
