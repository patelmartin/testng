package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void car()
	{
		System.out.println("car loan is good");
	}
	@Parameters({"URL"})
	@Test
	public void cartest(String uname)
	{
		System.out.println("car.test1 is open");
		System.out.println(uname);
	}
	@Test(groups={"smoke"})
	public void cartest2()
	{
		System.out.println("car.test2 is open");
	}
	@AfterSuite
	public void aftersui()
	{
		System.out.println("this will execute after all test cases");
	}
}
