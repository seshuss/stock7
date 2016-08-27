package com.stock.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpom 
{
	@Test
	public void exe()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		loginpageng lp=PageFactory.initElements(driver, loginpageng.class);
		lp.AdminLogin("admin", "master");
		
		homepagepom hp=PageFactory.initElements(driver, homepagepom.class);
		hp.sales("arjun","hi","s21suppliernumber","Materials","2","10","5","vat","900");
	}

}
