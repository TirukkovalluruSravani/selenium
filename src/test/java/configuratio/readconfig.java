package configuratio;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	Properties p;
	public readconfig()
	{
		File src=new File("C:\\Users\\sekhar\\eclipse-workspace\\WebDriver3\\sampleproject\\src\\test\\java\\configuratio\\c.properties");
		try
		{
			FileInputStream f= new FileInputStream(src);
			p=new Properties();
			p.load(f);

		}catch(Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getfirstname()
	{
		return p.getProperty("FName");
		
	}
	
	public String getlastname()
	{
		return p.getProperty("LName");
		
	}

	public String getphoneno()
	{
		return p.getProperty("Phone");
		
	}

	public String getemailid()
	{
		return p.getProperty("Email");
		
	}

	public String getaddress()
	{
		return p.getProperty("Address1");
		
	}

	public String city()
	{
		return p.getProperty("LName");
		
	}

	public String getcity()
	{
		return p.getProperty("City");
		
	}

	public String getstate()
	{
		return p.getProperty("State");
		
	}

	public String getPostalCode()
	{
		return p.getProperty("PostalCode");
		
	}

	public String getcountry()
	{
		return p.getProperty("Country");
		
	}

	public String getusername()
	{
		return p.getProperty("Username");
		
	}
	
	public String getpassword()
	{
		return p.getProperty("Password");
		
	}
	public String getconfirmpassword()
	{
		return p.getProperty("ConfirmPassword");
		
	}
	public String getUrl()
	{
		return p.getProperty("Url");
		
	}

	
}
