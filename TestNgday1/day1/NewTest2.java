package week6.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
	 @Test
	  public void test2() {
		  System.out.println("Test2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
	  }

	 
}
