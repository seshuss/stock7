package com.stock.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class uomc extends Basetng
{
  @Test(dataProvider="udata")
  public void uom(String uomid,String uomd)
  {
	  
	  SL.stockUOM(uomid,uomd);
  }
  @DataProvider
  
  public Object[][] udata()
  {
	  Object[][] obj=new Object[3][2];
	  
	  obj[0][0]="2567a1b";
	  obj[0][1]="new data1";
	  
	  obj[1][0]="2568b2c";
	  obj[1][1]="new data1";
	  
	  obj[2][0]="2569c3d";
	  obj[2][1]="new data1";
	  
	  return obj;
	  
	  
  }
}
