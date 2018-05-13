package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	
	@BeforeSuite(enabled=false)
	public void beforesui()
	{
		System.out.println("this will execute before all test cases");
	}
	@BeforeClass(enabled=false)
	public void beforeclass()
	{
		System.out.println("execte before class");
	}
	
	@BeforeMethod(enabled=false)
	public void beforemethod()
	{
		System.out.println(" execute before any method");
	}
	@AfterMethod(enabled=false)
	public void aftermethod()
	{
		System.out.println(" execute after any method");
	}
	@Test(dependsOnMethods={"personaltest2","weblogin"})
	public void personal()
	{
		System.out.println("personal loan is good");
	}
	@Parameters({"URL","username"})
	@Test 
	public void personaltest(String url,String uname)
	{
		System.out.println("personal.test1 is open");
		System.out.println(url);
		System.out.println(uname);
	}
	@Test
	public void personaltest2()
	{
		System.out.println("personal.test2 is open");
	}
	@AfterClass(enabled=false)
	public void afterclass()
	{
		System.out.println("execute after class");
	}
	@BeforeTest(enabled=false)
	public void beforetest()
	{
		System.out.println("before  test");
	}
	
	@Test
	public void weblogin()
	{
		System.out.println("weblogin for loan");
	}
	@Test
	public void mobilelogin()
	{
		System.out.println("mobile login for  loan");
	}
	@Test(dataProvider="getdata")
	public void apilogin(String username,String password)
	{
		System.out.println("api login for  loan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][]data=new Object[3][2];
		data[0][0]="martin";
		data[0][1]="M@rtin@610";
		
		data[1][0]="henal";
		data[1][1]="Henal@66";
		
		data[2][0]="riya";
		data[2][1]="Riya@14";
		return data;
	}
}
