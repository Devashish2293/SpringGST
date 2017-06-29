package com.gst.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class GetVendorInvoicesDetailsDAO {
	
	public void  getVendorInvoicesFromGSTN(Connection con) throws ClassNotFoundException, SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from HSN_SAC_SUMMARY ");
//		ArrayList<GSTR1HSNSummaryData> summaryDatas = new ArrayList<GSTR1HSNSummaryData>();
//		while (rs.next()){
//			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//			summaryDatas.add(new GSTR1HSNSummaryData(rs.getInt("serial_no"), "Goods", rs.getString("description"),rs.getString("hsn_sc"), rs.getString("unit_of_measure"), rs.getBigDecimal("quantity"),"InterState B2B",rs.getBigDecimal("Taxable_val"),rs.getBigDecimal("IGST_Amt"),rs.getBigDecimal("CGST_Amt"),rs.getBigDecimal("SGST_Amt"), rs.getBigDecimal("Cess_Amt")));
//		}
	}

}
