package com.techiegiri.pattern.structural.facade.helper;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getConnection() {
		return null;
	} 
	
	public static void generateHtmlReport(String tableName, Connection con) {
		System.out.println("Generating Mysql Html report");
	}
	
	public static void generatePdfReport(String tableName, Connection con) {
		System.out.println("Generating Mysql PDF report");
	}
}
