package com.broadways.swingdemo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getDbcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
