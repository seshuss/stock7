package com.stock.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageng 
{
  @FindBy(id="username")
  WebElement uname;
  
  @FindBy(id="password")
  WebElement pwd;
  @FindBy(id="btnsubmit")
  WebElement Login;
  @FindBy(id="btnreset")
  WebElement Reset;
  public void AdminLogin(String un,String pass)
  {
	  Reset.click();
	  uname.sendKeys(un);
	  pwd.sendKeys(pass);
	  Login.click();
  }
  
  
}
