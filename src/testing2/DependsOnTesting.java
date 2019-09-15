package testing2;

import org.testng.annotations.Test;

public class DependsOnTesting {

	@Test
	public void test1(){
		System.out.println("i am in test1");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2(){
		System.out.println("i am in test2");
	}
}
