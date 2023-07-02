package jobfest1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sitepage {
	
	WebDriver driver;

	By logo=By.xpath("//*[@id=\"header\"]/div/a[1]/img");
	By link=By.tagName("a");
	By login=By.xpath("//*[@id=\"header\"]/div/a[2]");
	By uemail=By.id("email");
	By upswd=By.id("password");
	By loginbutton=By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/form/button");
	By probutton=By.xpath("//*[@id=\"userDropdown\"]/i");
	By proclick=By.xpath("//*[@id=\"content\"]/nav/ul/li/div/a[1]");
	By prochange=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/a");
	By upload=By.xpath("//*[@id=\"photoview\"]");
	By username=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[2]/div[1]/input");
	By age=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[2]/div[2]/input");
	By addess=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[3]/div[1]/div/textarea");
	By district=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[3]/div[2]/div/select");
	By aadhar=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[4]/div[2]/div/input");
	By gender=By.xpath("//*[@id=\"gender\"]");
	By mob=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[5]/div[2]/div/input");
	By skills=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[6]/div[1]/div/div/button/div");
	By skset=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[6]/div[1]/div/div/div/div[2]/ul/li[6]/a");
	By linkd=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[8]/div[1]/div/input");
	By qual=By.id("qualification0");
	By course=By.id("course0");
	By spec=By.xpath("//*[@id=\"specialisation0\"]");
	By uni=By.id("board0");
	By coll=By.name("institution0");
	By per=By.name("cgpa0");
	By yop=By.name("pass0");
	By hb=By.name("hback0");
	By cb=By.name("cback0");
	By reg=By.name("reg0");
	By resume=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div/form/div[11]/div[10]/div/div[1]/div[1]/div/button");
	By ok=By.id("asapcourses");
	public sitepage(WebDriver driver2) {
		this.driver=driver2;
	}
	public void logo()
	{
		Boolean l=driver.findElement(logo).isDisplayed();
		if(l)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	

	public void linkszie()
	{
		
	 List<WebElement>  links= driver.findElements(link);
	System.out.println("total links="+links.size());
	}
	
	public void response() throws Exception 
	{
		URL a=new URL("https://placement.asapkerala.gov.in/");
		HttpURLConnection b=(HttpURLConnection)a.openConnection();
		b.connect();
		System.out.println("Response code is"+b.getResponseCode());
	}
	
	public void login(String email,String pswd)
	{
		driver.findElement(login).click();
		driver.findElement(uemail).sendKeys(email);
		driver.findElement(upswd).sendKeys(pswd);
		driver.findElement(loginbutton).click();
		
	}
	public void profile()
	{
	driver.findElement(probutton).click();
	driver.findElement(proclick).click();
	driver.findElement(prochange).click();
	
	
	}
	public void fileupload() throws Exception
	{
		driver.findElement(upload).click();
		fileupload("C:\\Users\\91949\\OneDrive\\Desktop\\keshav docs\\image.jpg");

	}
	
	public void fileupload(String p) throws AWTException
	
	{
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		
		Robot robot=new Robot();
		robot.delay(1000);

		
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
  
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void register(String name,String ag,String add,String aad,String mb,String u,String cl,String cg,String yp,String b,String r)
	{
	driver.findElement(username).sendKeys(name);
	driver.findElement(age).sendKeys(ag);
	driver.findElement(addess).sendKeys(add);
	Select s=new Select(driver.findElement(district));
	s.selectByVisibleText("Alappuzha");
	driver.findElement(aadhar).sendKeys(aad);
	Select g=new Select(driver.findElement(gender));
	g.selectByVisibleText("Male");
	driver.findElement(mob).sendKeys(mb);
	driver.findElement(skills).click();
	driver.findElement(skset).click();
	 Select q=new Select(driver.findElement(qual));
	 q.selectByVisibleText("Under Graduation");
	 Select c=new Select(driver.findElement(course));
	 c.selectByVisibleText("B.Tech");
	 Select sp=new Select(driver.findElement(spec));
	 sp.selectByVisibleText("Electronic Engineering");
	 driver.findElement(uni).sendKeys(u);
	 driver.findElement(coll).sendKeys(cl);
	 driver.findElement(per).sendKeys(cg);
	 driver.findElement(yop).sendKeys(yp);
	 driver.findElement(hb).sendKeys(b);
	 driver.findElement(cb).sendKeys(b);
	 driver.findElement(reg).sendKeys(r);
	}

public void resumeup() throws Exception
{
	driver.findElement(resume).click();
	resumeup("C:\\Users\\91949\\Downloads\\ASAP.pdf");
}
public void resumeup(String v) throws AWTException
{
	StringSelection strSelection=new StringSelection(v);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	
	Robot robot=new Robot();
	robot.delay(1000);

	
	robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
	
public void title()
{
	String z=driver.getTitle();
	String x="Student Dashboard";
	Assert.assertEquals(z, x);
	System.out.println("the titele is" +z);
}
	

	 
	 
	 
	 public void submit()
	 {
		 driver.findElement(ok).click();
		 
		 driver.quit();
	
	 }
	
	
	}


	
	

	

			
			
	
	
	


