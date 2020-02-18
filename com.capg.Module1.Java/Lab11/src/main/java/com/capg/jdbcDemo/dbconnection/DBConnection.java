package com.capg.jdbcDemo.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","GAURAV","gaurav1");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	catch(SQLException e)
		{
			e.printStackTrace();
	    }
		return con;
		
	}

}
