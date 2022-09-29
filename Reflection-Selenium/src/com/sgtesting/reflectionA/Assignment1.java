package com.sgtesting.reflectionA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment1 
{
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			
		}catch(Exception  e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2,dataProvider="logincredential")
	private static void login(String username,String pwd)
	{
		try
		{
			
     		String expected=("actiTIME - Login");
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			oBrowser.findElement(By.id("username")).sendKeys(username);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority=3)
	private static void minimizeFlyOut()
	{
		try
		{
			
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();	
			String expected="actiTIME - Enter Time-Track";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4,dataProvider="getDetails")
	private static void createUser(String firstName,String lastName, String email, String username,String password,String passwordCopy)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			String expected="actiTIME - User List";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
			
			
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys(firstName);
			oBrowser.findElement(By.name("lastName")).sendKeys(lastName);
			oBrowser.findElement(By.name("email")).sendKeys(email);
			oBrowser.findElement(By.name("username")).sendKeys(username);
			oBrowser.findElement(By.name("password")).sendKeys(password);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(passwordCopy);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	private static void deleteUser()
	{
		try
		{
			
			String expected="actiTIME - User List";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			oBrowser.findElement(By.xpath("//span[text()='gowda, priyanka']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void logout()
	{
		try
		{
			
			String expected="actiTIME - User List";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] logincredential()
	{
		Object a[][]= {{"admin","manager"}};
		return a;
	}
	
	@DataProvider
	public Object[][] getDetails()
	{
		Object p[][]= {{"priyanka","gowda","priyankaljdp@gmail.com","priyankaGowda","qwerty","qwerty"}};
		return p;
		
	}
	
	
			
	
}
