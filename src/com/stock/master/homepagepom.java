package com.stock.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class homepagepom 
{
	
	@FindBy(xpath=".//*[@id='mi_a_sales']/a")
	WebElement saleslink;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement addlink;
	@FindBy(xpath=".//*[@id='x_Customer_ID']")
	WebElement custid;
	@FindBy(xpath=".//*[@id='x_Notes']")
	WebElement cnote;
	@FindBy(xpath=".//*[@id='x1_Supplier_Number']")
	WebElement supnubmer;
	@FindBy(xpath=".//*[@id='x1_Stock_Item']")
	WebElement supit;
	@FindBy(xpath=".//*[@id='x1_Sales_Quantity']")
	WebElement squantity;
	@FindBy(xpath=".//*[@id='x_Discount_Percentage']")
	WebElement cdis;
	@FindBy(xpath=".//*[@id='x_Tax_Percentage']")
	WebElement taxper;
	@FindBy(xpath=".//*[@id='x_Tax_Description']")
	WebElement ctax;
	@FindBy(xpath=".//*[@id='x_Total_Payment']")
	WebElement totalpayment;
	@FindBy(xpath=".//*[@id='btnAction']")
	WebElement addrecored;
	@FindBy(xpath="html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement addpopup;
	@FindBy(xpath="html/body/div[3]/div[2]/div/div[4]/div[2]/button")
	WebElement addpopup1;
	public void sales(String cid,String cn,String supnum,String si,String sq,String cdp,String ctp,String ctd,String tp)
	{
	saleslink.click();
	addlink.click();
	Sleeper.sleepTightInSeconds(2);
	custid.sendKeys(cid);
	Sleeper.sleepTightInSeconds(2);
	supnubmer.sendKeys(supnum);
	Sleeper.sleepTightInSeconds(2);
	supit.sendKeys(si);
	Sleeper.sleepTightInSeconds(2);
	squantity.sendKeys(sq);
	cnote.sendKeys(cn);
	Sleeper.sleepTightInSeconds(2);
	cdis.sendKeys(cdp);
	Sleeper.sleepTightInSeconds(2);
	taxper.sendKeys(ctp);
	Sleeper.sleepTightInSeconds(2);
	ctax.sendKeys(ctd);
	Sleeper.sleepTightInSeconds(2);
	totalpayment.sendKeys(tp);
	Sleeper.sleepTightInSeconds(2);
	addrecored.click();
	Sleeper.sleepTightInSeconds(2);
	addpopup.click();
	Sleeper.sleepTightInSeconds(2);
	addpopup1.click();
	}
}
