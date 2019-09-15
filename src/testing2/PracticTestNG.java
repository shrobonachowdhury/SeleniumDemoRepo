package testing2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticTestNG {

	@BeforeSuite
	public void suite1(){
		System.out.println("i am iin suite");
	}
	
	@BeforeClass
	public void suite2(){
		System.out.println("i am in class");
	}

	@BeforeTest
	public void suite3(){
		System.out.println("i am in test");
	}
		
	@BeforeMethod
	public void suite4(){
		System.out.println("i am in method");
	}
	
	@Test
	public void test(){
		System.out.println("i am in test1");
	}
		
	@Test
	public void test2(){
		System.out.println("i am in test2");
	}
	
	@AfterMethod
	public void suite5(){
		System.out.println("i am in after method");
	}
	
	@AfterClass
	public void suite6(){
		System.out.println("i am in after class");
	}
	}

