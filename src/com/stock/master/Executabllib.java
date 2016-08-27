package com.stock.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Executabllib {

	public static void main(String[] args) throws IOException {
		
		stocklib sl=new stocklib();
		String res=sl.OpenApp("http://webapp.qedgetech.com");
		 System.out.println(res);
		 res=sl.AdminLogin("admin", "master");
		 System.out.println(res);
		 //sl.sicreation("car12","Audi8B","fresh","100","2500","3000","hukj");
		 //System.out.println(res);
		 sl.Customers("raj1", "hdy", "tel", "india", "person1", "54651313", "raj1@gmail.com", "54575", "hi");
		 System.out.println(res);
		 //sl.purchaser("hi","585245","256584");
		// System.out.println(res);
		 /*res=sl.sicreation("new7","15825","20000","new7 stock");
		 System.out.println(res);*/
		 //sl.export();
		 //sl.slogout();
		 //System.out.println("Logout Sucessfully");
		 
	}
}

/*		

		 res=sl.Suppliers("audi12","hyd","hyd1","india","ses","123","afsdf@gmail.com","4649846","hiud");
		 System.out.println(res);
		 res=sl.stockcat("car12");
		 System.out.println(res);
		 res=sl.stockUOM("1025885412", "cars new models");
		 System.out.println(res);
		 res=sl.sicreation("new7","15825","20000","new7 stock");
		 System.out.println(res);
	
     FileInputStream Fis=new FileInputStream("D:\\seshu\\ERP\\ERPStock\\src\\com\\stock\\testdata\\UOM_Creation.xlsx");
        XSSFWorkbook WB=new XSSFWorkbook(Fis);
        XSSFSheet WS=WB.getSheet("uomdata");
        //for single values
        XSSFRow WR=WS.getRow(1);
        XSSFCell WC=WR.getCell(0);
        String Res=WC.getStringCellValue();
        System.out.println(Res);
        int RC=WS.getLastRowNum();
        for(int i=1;i<=RC;i++)
        {
        	XSSFRow WR=WS.getRow(i);
        	XSSFCell WC=WR.getCell(0);
        	XSSFCell WC1=WR.getCell(1);
        	XSSFCell WC2=WR.createCell(2);
        	String uomid=WC.getStringCellValue();
        	String uomd=WC1.getStringCellValue();
            res=sl.stockUOM(uomid,uomd);
        	System.out.println(res);
        	WC2.setCellValue(res);
        }
        FileOutputStream Fos=new FileOutputStream("D:\\seshu\\ERP\\ERPStock\\src\\com\\stock\\results\\UOM_Result.xlsx");
        WB.write(Fos);
        WB.close();
       
    String Fpath="D:\\seshu\\ERP\\ERPStock\\src\\com\\stock\\testdata\\uomdata.txt";
    String Rpath="D:\\seshu\\ERP\\ERPStock\\src\\com\\stock\\results\\uomres.txt";
    String SD;
    FileReader FR=new FileReader(Fpath);
    BufferedReader BR=new BufferedReader(FR);
    String Sread=BR.readLine();
    System.out.println(Sread);
    
    FileWriter FW=new FileWriter(Rpath);
    BufferedWriter BW=new BufferedWriter(FW);
    BW.write(Sread+"$$$"+res);
    BW.newLine();
    
    while((SD=BR.readLine())!=null)
    {
    	System.out.println(SD);
    	String[] SR=SD.split("@");
    	String uomid=SR[0];
    	System.out.println(uomid);
    	String uomd =SR[1];
    	System.out.println(uomd);
    	res=sl.stockUOM(uomid, uomd);
    	System.out.println(res);
    	BW.write(uomid+"$$$"+uomd+"&&&"+res);
    	BW.newLine();
    }
    BW.close();
    FW.close();
 }
}*/

