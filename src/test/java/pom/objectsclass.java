package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectsclass {
WebDriver d;
	
 public objectsclass(WebDriver driver) throws IOException
	{
		this.d=driver;
		PageFactory.initElements(driver, this);
		
	}
	


	@FindBy(name="firstName")WebElement firstName;
	@FindBy(name="lastName")WebElement lastName;
	@FindBy(name="phone")WebElement phone;
	@FindBy(name="userName")WebElement email;
	@FindBy(name="address1")WebElement address1;
	@FindBy(name="city")WebElement city;
	@FindBy(name="state")WebElement state;
	@FindBy(name="postalCode")WebElement postalCode;
	@FindBy(name="country")WebElement country;
	@FindBy(name="email")WebElement username;
	@FindBy(name="password")WebElement password;
	@FindBy(name="confirmPassword")WebElement confirmPassword;
	@FindBy(name="submit")WebElement click;
	
	
	public void Fname(String a)
	{
		firstName.sendKeys(a);
	}
	public void Lname(String a)
	{
		lastName.sendKeys(a);
	}
	
	public void Phone(String a)
	{
		phone.sendKeys(a);
	}
	
	public void Email(String a)
	{
		email.sendKeys(a);
	}
	
	public void Address1(String a)
	{
		address1.sendKeys(a);
	}
	
	public void City(String a)
	{
		city.sendKeys(a);
	}
	
	public void State(String a)
	{
		state.sendKeys(a);
	}
	
	public void PostalCode(String a)
	{
		postalCode.sendKeys(a);
	}
	
	public void Country(String a)
	{
		country.sendKeys(a);
	}
	
	public void Username(String a)
	{
		username.sendKeys(a);
	}
	
	public void Password(String a)
	{
		password.sendKeys(a);
	}
	public void ConfirmPassword(String a)
	{
		confirmPassword.sendKeys(a);
	}
	
	public void Click()
	{
		click.click();
	}


}
