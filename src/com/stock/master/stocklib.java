package com.stock.master;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class stocklib 
{
	public static WebDriver driver;
	public static String Expted,Actual;
	
	public String OpenApp(String url)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Expted="Login";
		driver.get(url);
		Actual=driver.findElement(By.id("btnsubmit")).getText();
		if(Expted.equalsIgnoreCase(Actual))
		{
			return "pass";
		}
		else
		{
			return "Fail";
		}
		
	}
   public String AdminLogin(String UN,String PWD)
   {
	    driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(PWD);
		driver.findElement(By.id("btnsubmit")).click();
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
   //Suppliers creation
   
public String Suppliers(String Sn,String Sa,String Sc,String Scountry,String Scp,String Sph,String Se,String Sm,String Snote)
	{
		Expted="Add succeeded";
		driver.findElement(By.linkText("Suppliers")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/.")).click();
		Sleeper.sleepTightInSeconds(2);
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
		Sleeper.sleepTightInSeconds(2);
	    Actual=driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div/div")).getText();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		Sleeper.sleepTightInSeconds(2);
		if(Expted.equalsIgnoreCase(Actual))
		{
			return "pass";
		}
		else
		{
			return "Faild";
	    }
}

//Stock Catagories

	public String stockcat(String cn)
	{
		Expted="Add succeeded";
		Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys(cn);//category name
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    Sleeper.sleepTightInSeconds(2);
	    Actual=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
	    Sleeper.sleepTightInSeconds(2);
	    if(Expted.equalsIgnoreCase(Actual))
		{
			return "pass";
		}
		else
		{
			return "Faild";
	    }
	} 
	public String stockUOM(String uomid,String uomd)
	{
		Expted="Add succeeded";
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath(".//*[@id='x_UOM_ID']")).sendKeys(uomid);//uom id
	    driver.findElement(By.xpath(".//*[@id='x_UOM_Description']")).sendKeys(uomd);//uom description
	    driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    Actual=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	    Sleeper.sleepTightInSeconds(2);
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
//stock iteam creation
 public String sicreation(String Sicategory,String sunumber,String sname,String siUOm,String pp,String sp,String note)
 {
	 Expted="Add succeeded";
 driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
 Sleeper.sleepTightInSeconds(5);
 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
 Sleeper.sleepTightInSeconds(5);
 driver.findElement(By.xpath(".//*[@id='x_Category']")).sendKeys(Sicategory);
 driver.findElement(By.xpath(".//*[@id='x_Supplier_Number']")).sendKeys(sunumber);
 driver.findElement(By.xpath(".//*[@id='x_Stock_Name']")).sendKeys(sname);
 driver.findElement(By.xpath(".//*[@id='x_Unit_Of_Measurement']")).sendKeys(siUOm);
 driver.findElement(By.xpath(".//*[@id='x_Purchasing_Price']")).sendKeys(pp);
 driver.findElement(By.xpath(".//*[@id='x_Selling_Price']")).sendKeys(sp);
 driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys(note);
 driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
 driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
 
 Actual=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
 Sleeper.sleepTightInSeconds(5);
 driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
 Sleeper.sleepTightInSeconds(5);

 if(Expted.equalsIgnoreCase(Actual))
	{
		return "pass";
	}
	else
	{
		return "Faild";
   }
 
 }
 
 /*public void export()
 {
	 driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
	 Actions act=new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[1]/div/button"))).build().perform();
	 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[1]/div/button")).click();
     driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[1]/div/ul/li[2]/a")).click();
 }*/
 public String purchaser(String Snote,String TotalA,String TotalP)
 {
	 Expted="Add succeeded";
	 driver.findElement(By.xpath(".//*[@id='mi_a_purchases']/a")).click();
	 Sleeper.sleepTightInSeconds(2);
	 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	 Sleeper.sleepTightInSeconds(5);
	 driver.findElement(By.xpath(".//*[@id='x_Supplier_ID']")).sendKeys("Audi1oc");
	 Sleeper.sleepTightInSeconds(2);
	 driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys(Snote);
	 driver.findElement(By.xpath(".//*[@id='x_Total_Amount']")).sendKeys(TotalA);
	 driver.findElement(By.xpath(".//*[@id='x_Total_Payment']")).sendKeys(TotalP);
     driver.findElement(By.xpath(".//*[@id='btnAction']")).click(); 
     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
     Sleeper.sleepTightInSeconds(2);
     Actual=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
     Sleeper.sleepTightInSeconds(2);
     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
     if(Expted.equalsIgnoreCase(Actual))
 	 {
 		return "pass";
 	 }
 	else
 	{
 		return "Faild";
    }
 }
 //Creation of customers
public String Customers(String Cname,String CAddress,String Ccity,String Ccountry,String Ccperson,String Cpn,String Cemail,String Cmn,String Cnote)
 {
	 driver.findElement(By.xpath(".//*[@id='mi_a_customers']/a")).click();
	 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	 Sleeper.sleepTightInSeconds(2);
	 driver.findElement(By.xpath(".//*[@id='x_Customer_Name']")).sendKeys(Cname);
	 driver.findElement(By.xpath(".//*[@id='x_Address']")).sendKeys(CAddress);
	 driver.findElement(By.xpath(".//*[@id='x_City']")).sendKeys(Ccity);
	 driver.findElement(By.xpath(".//*[@id='x_Country']")).sendKeys(Ccountry);
	 driver.findElement(By.xpath(".//*[@id='x_Contact_Person']")).sendKeys(Ccperson);
	 driver.findElement(By.xpath(".//*[@id='x_Phone_Number']")).sendKeys(Cpn);
	 driver.findElement(By.xpath(".//*[@id='x__Email']")).sendKeys(Cemail);
	 driver.findElement(By.xpath(".//*[@id='x_Mobile_Number']")).sendKeys(Cmn);
	 driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys(Cnote);
	 driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	 Sleeper.sleepTightInSeconds(2);
	 driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	 Sleeper.sleepTightInSeconds(2);
     Actual=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
     Sleeper.sleepTightInSeconds(5);
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
	//Application Logout Function
public void slogout()
{
	driver.findElement(By.xpath(".//*[@id='logout']")).click();
	Sleeper.sleepTightInSeconds(6);
	WebElement el=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
	if (el.isDisplayed()) 
	{
		el.click();
		Sleeper.sleepTightInSeconds(2);
	}
	
}
	

//Application Close
public void sclose()
 {
	driver.close();
 }
}
