package Actionss;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.objectsclass;

public class Register extends Baseclass{
	
	@Test
	public void regi() throws IOException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objectsclass o=new objectsclass(driver);
		o.Fname(fname);
		o.Lname(lastname);
		o.Phone(phone);
		o.Email(email);
		o.Address1(Address1);
		o.City(city);
		o.State(state);
		o.PostalCode(postalcode);
		o.Country(country);
		o.Username(username);
		o.Password(password);
		o.ConfirmPassword(confirmpassword);
		o.Click();
		Assert.assertTrue(true);
	}
	
	@Test
	public void title()
	{
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);
	}
	
	@Test
	public void geturl()
	{
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(true);
	}

}
