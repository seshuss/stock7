package com.stock.master;

import org.testng.Assert;
import org.testng.annotations.Test;



public class exampletng 
{
	@Test(priority=1)
	public void xyz()
	{
			Assert.assertEquals("Gmail", "Gmail");
	}
   @Test(priority=3,enabled=false)
	public void abc()
	{
			Assert.assertEquals("xyz", "xyz");
	}
     @Test(priority=2)
	public void pqr()
	{
			Assert.assertEquals("fb", "fb");
	}
}
