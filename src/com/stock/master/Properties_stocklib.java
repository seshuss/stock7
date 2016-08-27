package com.stock.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Properties_stocklib {

	public static Properties pr;
	public static FileInputStream Fis;
	public static WebDriver driver;
	public static String Expted,Actual;
	
	public String OpenApp(String URL) throws IOException
	{
		pr=new Properties();
		Fis=new FileInputStream("D:\\ERP\\ERPStock\\src\\com\\stock\\propertites\\Rep.properties");
		pr.load(Fis);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Expted="Login";
		driver.get(URL);
		Actual=driver.findElement(By.xpath(pr.getProperty("Login"))).getText();
		if(Expted.equalsIgnoreCase(Actual))
		{
			return "pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	 public String AdminLogin(String UN,String PWD) throws IOException
	   {
		   
		    driver.findElement(By.xpath(pr.getProperty("Reset"))).click();
		    driver.findElement(By.xpath(pr.getProperty("Uname"))).sendKeys(UN);
		    driver.findElement(By.xpath(pr.getProperty("pwd"))).sendKeys(PWD);
		    driver.findElement(By.xpath(pr.getProperty("Login"))).click();
			 Expted="Administrator";
			Actual=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
			if(Expted.equalsIgnoreCase(Actual))
			{
				return "pass";
			}
			else
			{
				//System.out.println("Login does Not Sucessfully");
				return "Fail";
				
			}
	   }
	 public String Suppliers(String Sn,String Sa,String Sc,String Scountry,String Scp,String Sph,String Se,String Sm,String Snote)
		{
			Expted="Add succeeded";
			driver.findElement(By.linkText("Suppliers")).click();
			Sleeper.sleepTightInSeconds(10);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/.")).click();
			Sleeper.sleepTightInSeconds(20);
			driver.findElement(By.id("x_Supplier_Name")).sendKeys(Sn);
			driver.findElement(By.id("x_Address")).sendKeys(Sa);
			driver.findElement(By.id("x_City")).sendKeys(Sc);
			driver.findElement(By.id("x_Country")).sendKeys(Scountry);
			driver.findElement(By.id("x_Contact_Person")).sendKeys(Scp);
			driver.findElement(By.id("x_Phone_Number")).sendKeys(Sph);
			driver.findElement(By.xpath(".//*[@id='x__Email']")).sendKeys(Se);
			driver.findElement(By.xpath(".//*[@id='x_Mobile_Number']")).sendKeys(Sm);
			driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys(Snote);
			driver.findElement(By.id("btnAction")).click();
			Sleeper.sleepTightInSeconds(2);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(10);
		    Actual=driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div/div")).getText();
			Sleeper.sleepTightInSeconds(20);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			if(Expted.equalsIgnoreCase(Actual))
			{
				return "pass";
			}
			else
			{
				return "Faild";
		    }
	}
}
	
	
