package com.stock.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basicscript {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String Expted="Login";
		driver.get("http://webapp.qedgetech.com");
		String Actual=driver.findElement(By.id("btnsubmit")).getText();
		if(Expted.equalsIgnoreCase(Actual))
		{
			System.out.println("Apllication Launched Sucessfully");
		}
		else
		{
			System.out.println("Apllication deos not Launched");
		}
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		String Expted1="Administrator";
		String Actual1=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
		if(Expted1.equalsIgnoreCase(Actual1))
		{
			System.out.println("Login Sucessfully");
		}
		else
		{
			System.out.println("Login does Not Sucessfully");
		}
		driver.findElement(By.linkText("Suppliers")).click();
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("Audi008");
		driver.findElement(By.id("x_Address")).sendKeys("mainroad,Ammerpet");
		driver.findElement(By.id("x_City")).sendKeys("Hyderabad");
		driver.findElement(By.id("x_Country")).sendKeys("India");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("Kumar");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("9586588552");
		driver.findElement(By.xpath(".//*[@id='x__Email']")).sendKeys("kumar007@gmail.com");
		driver.findElement(By.xpath(".//*[@id='x_Mobile_Number']")).sendKeys("9574852345");
		driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys("hi");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[4]/div[2]/button")).click();
		Sleeper.sleepTightInSeconds(7);
		Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys("cars1");//category name
	    driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
	    Sleeper.sleepTightInSeconds(2);
	    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
	    Sleeper.sleepTightInSeconds(7);
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath(".//*[@id='x_UOM_ID']")).sendKeys("1010101");//uom id
	    driver.findElement(By.xpath(".//*[@id='x_UOM_Description']")).sendKeys("Audi car models");//uom description
	    driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
	    Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	    //driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		
	}

}
