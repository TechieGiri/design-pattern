package com.techiegiri.pattern.structural.facade.helper;

import java.sql.Connection;

public class HelperFacade {
	
	static Connection con;
	
	public static void generateReport(String dbType, String reportType, String tableName) {
		
		switch (dbType) {
		case "MYSQL" :
			con = MySqlHelper.getConnection();
			switch (reportType) {
			case "HTML":
				MySqlHelper.generateHtmlReport("Employee", con);
				break;
				
			case "PDF":
				MySqlHelper.generatePdfReport("Employee", con);
				break;
			}
			break;

		case "ORACLE" :
			con = OracleHelper.getConnection();
			switch (reportType) {
			case "HTML":
				OracleHelper.generateHtmlReport("Employee", con);
				break;
				
			case "PDF":
				OracleHelper.generatePdfReport("Employee", con);
				break;
			}
			break;
		}
		
	}
	

}
