package Actionss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import configuratio.readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	readconfig reading=new readconfig();
	
public String baseurl=reading.getUrl();
public String fname=reading.getfirstname();
public String lastname=reading.getlastname();
public String phone=reading.getphoneno();
public String email=reading.getemailid();
public String Address1=reading.getaddress();
public String city=reading.getcity();
public String state=reading.getstate();
public String postalcode=reading.getPostalCode();
public String country=reading.getcountry();
public String username=reading.getusername();
public String password=reading.getpassword();
public String confirmpassword=reading.getconfirmpassword();

public static WebDriver driver;

@Parameters("Browser")
@BeforeClass
public void setup(String Browser)
{
if(Browser.equals("chrome"))
{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

}
else if(Browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
	}
	else if(Browser.equals("edge"))
		
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();

	}
driver.get(baseurl);

}

@AfterClass
public void teardown()
{
	driver.quit();
	
}

public String getscreenshot(String testCaseName) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File filepath=new File(System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png");
	FileUtils.copyFile(src, filepath);
	return System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
	
}


}
