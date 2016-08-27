package com.stock.master;

import java.io.IOException;

public class Pro_Executabllib {

	public static void main(String[] args) throws IOException {
		Properties_stocklib psl=new Properties_stocklib();
		String res=psl.OpenApp("http://webapp.qedgetech.com/login.php");
		System.out.println(res);
		res=psl.AdminLogin("admin", "master");
		System.out.println(res);

	}

}
