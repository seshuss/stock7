package com.stock.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Basetng {
   public static  stocklib SL=new stocklib();
  @BeforeTest
  public void beforeTest() {
	  SL.AdminLogin("admin", "master");
  }

  @AfterTest
  public void afterTest() {
	  SL.slogout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  SL.OpenApp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite() 
  {
	 SL.sclose();
  }

}
