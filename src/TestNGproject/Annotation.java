package TestNGproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation 
{
	@BeforeMethod
	public void login()
	{
		System.out.println("login to app");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout the app");
	}
	@Test
	public void createcustomer()
	{
		System.out.println("createcustomer");
	}
	public void Dletecustomer()
	{
		System.out.println("Deletecustomer");
	}

}
