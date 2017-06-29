package com.gst.Services;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.gst.Dao.DbConnection;
import com.gst.Dao.GetVendorInvoicesDetailsDAO;

public class GetVendorInvoicesDetails {
//ArrayList<GSTR1HSNSummaryData> 
	public void getVendorInvoicesDetails(String taxpayerGSTIN, String ret_period) throws ClassNotFoundException, SQLException, IOException {
		
	    HttpURLConnection connection = null;	
		//byte[] uniqueyAppKey = GenerateAppKey.appkeyGen();	
		 String url = "https://<domain-name>/taxpayerapi/v0.3/returns/gstr2";    
		 String action = "B2B";
		 String userName = "Reflex.TN.TP.2";
		 String Encryption ="Yes";
		 String Content_Type = "application/json";
		 String tax_payers_GSTIN="33GSPTN4811G1ZC";
		 String returnperiod = "062017";
		// String ctin = ;
		// String from_time = ;
		 URL obj = new URL(url);
	     connection = (HttpURLConnection) obj.openConnection();
	     connection.setRequestMethod("POST");
	     connection.setRequestProperty("Content-Type","application/json");     
	     // Add headers.
	     //connection.setRequestProperty("Encryption","Yes");
	     connection.setRequestProperty("clientid", "l7xxaf87e91f647a4c708b8e9fec2d85e500");
	     connection.setRequestProperty("client-secret", "4b37b6d6f7ef4e4f93ddd812a72d2a1d");   
	     connection.addRequestProperty("state-cd", "33");
	     connection.addRequestProperty("ip-usr", "172.23.14.67");
	     connection.addRequestProperty("txn", "LAPN24235323434"); 
	     connection.addRequestProperty("Cache-Control","no-cache");
	
	     connection.setDoOutput(true);
	     DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
	     
	     wr.writeBytes("action_required=Y"+"action="+action+"gstin="+tax_payers_GSTIN+"ret_period="+ret_period);
				
		  wr.flush();
		  wr.close();
		
		
		DbConnection db = new DbConnection();
		Connection con = db.getDbConnection();
		GetVendorInvoicesDetailsDAO vendorInvoices = new GetVendorInvoicesDetailsDAO();
		vendorInvoices.getVendorInvoicesFromGSTN(con);			
		con.close();
		
	}
	
}
