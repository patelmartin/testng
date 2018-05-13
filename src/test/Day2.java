package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void home()
	{
		System.out.println("home loan is good");
	}
	@Test(groups={"smoke"})
	public void hometest()
	{
		System.out.println("home.test1 is open");
	}
	@Parameters({"URL"})
	@Test
	public void hometest2(String urll)
	{
		System.out.println("home.test2 is open");
		System.out.println(urll);
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
}
