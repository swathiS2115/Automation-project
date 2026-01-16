package test;

import org.testng.annotations.Test;

import base.Login_base;

public class Login_test extends Login_base{
	@Test(priority = 1)
	public void login()
	{
		rent.clickprofile();
	}
	@Test(priority = 2)
	public void phone()
	{
		rent.enterphonenumber("7736919053");
	}
	@Test(priority = 3)
	public void otp()
	{
		rent.clickverify();
	}

	
}
