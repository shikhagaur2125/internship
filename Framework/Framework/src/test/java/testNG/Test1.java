package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeClass
	public void beforetest() {
		System.out.println("Before Test");
	}
	@AfterClass
	public void aftertest() {
		System.out.println("After Test");
	}
  @Test(groups = {"smoke"})
  public void printName() {
	  System.out.println("Shikha");
  }
}
