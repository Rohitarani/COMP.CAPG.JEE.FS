package com.capg.jdbcDemo.ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.capg.jdbcDemo.dto.Rohita;
import com.capg.jdbcDemo.service.EmployeeService;


import com.capg.jdbcDemo.dbconnection.DBConnection;

public class EmployeeUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		System.out.println(con);
	}

}
