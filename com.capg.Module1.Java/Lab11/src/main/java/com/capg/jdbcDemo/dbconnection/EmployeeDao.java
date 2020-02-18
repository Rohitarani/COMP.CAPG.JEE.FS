package com.capg.jdbcDemo.dbconnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.jdbcDemo.dto.Rohita;

public class EmployeeDao {
	Connection con = null;
	PreparedStatement psInsert;
	PreparedStatement psSelect;
	ResultSet result;
	public EmployeeDao()
	{
		con = DBConnection.getConnection();
	}
	public boolean employeeRegisterDao(Rohita empBean)
	{
		try {
			psInsert=con.prepareStatement("insert into Rohita values(?,?,?,?)");
			psInsert.setString(1, empBean.getUserId());
			psInsert.setString(2, empBean.getFname());
			psInsert.setString(3, empBean.getLname());
			psInsert.setInt(4, empBean.getAge());
			
			int result = psInsert.executeUpdate();
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Rohita> displayEmpDetailsDao(int age)
	{
		List<Rohita> empList = new ArrayList<Rohita>();
		try
		{
			psSelect = con.prepareStatement("select * from Rohita where age>=?");
			psSelect.setInt(1, age);
			//psSelect.setInt(4, age);
			
			result = psSelect.executeQuery();
			
			while(result.next())
			{
				Rohita userBean = new Rohita();
				userBean.setUserId(result.getString(1));
				userBean.setFname(result.getString(2));
				userBean.setLname(result.getString(3));
				userBean.setAge(result.getInt(4));
				empList.add(userBean);
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return empList;
	}
}
