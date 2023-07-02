package jobfest2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jobfest1.sitepage;

public class jobfesttest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://placement.asapkerala.gov.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void jobfestTest()throws Exception
	{
		sitepage ob=new sitepage(driver);
		ob.logo();
		ob.linkszie();
		ob.login("keshavnair29@gmail.com", "Asap@123");
		ob.response();
		ob.profile();
		ob.fileupload();
		ob.register("keshav", "23", "abc","1234","9447374822","ABC UNIVERSITY","ABC COLLEGE","60","2022","0","1232");
		ob.resumeup();
		ob.title();
		ob.submit();
	;

		
	}

		
	
}
