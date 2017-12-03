package com.techiegiri.pattern.structural.facade.helper;

import java.sql.Connection;

/*
 * @author Techie Giri
 * Pattern: Facade Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: best e.g. : JDBC Driver Manager
 *  					Facade design pattern is used to help client applications to easily interact with the system.
 *  					Provide a unified interface to a set of interfaces in a subsystem. 
 *  					Facade Pattern defines a higher-level interface that makes the subsystem easier to use.				
 * 
 * Advantage: Provide a wrapper interface on top of the existing interface to help client application.
 *  
 */

public class FacadeDemo {

	public static void main(String[] args) {
		String tableName = "Employee";
		
		//	Invoking w/o facade
		System.out.println("Wo start");
		Connection mySqlCon = MySqlHelper.getConnection();
		MySqlHelper.generateHtmlReport(tableName, mySqlCon);
		MySqlHelper.generatePdfReport(tableName, mySqlCon);

		Connection oracleCon = OracleHelper.getConnection();
		OracleHelper.generateHtmlReport(tableName, oracleCon);
		OracleHelper.generatePdfReport(tableName, oracleCon);
		System.out.println("Wo end");
		
		//	Invoking with facade
		System.out.println("With start");
		HelperFacade.generateReport("MYSQL", "HTML", tableName);
		HelperFacade.generateReport("MYSQL", "PDF", tableName);
		HelperFacade.generateReport("ORACLE", "HTML", tableName);
		HelperFacade.generateReport("ORACLE", "PDF", tableName);
		System.out.println("With end");
	}

}
