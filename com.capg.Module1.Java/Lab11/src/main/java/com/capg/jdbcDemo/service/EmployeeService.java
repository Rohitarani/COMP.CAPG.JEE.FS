package com.capg.jdbcDemo.service;

import java.util.List;

import com.capg.jdbcDemo.dbconnection.EmployeeDao;
import com.capg.jdbcDemo.dto.Rohita;

public class EmployeeService {
	EmployeeDao empObj = new EmployeeDao();
	public boolean employeeRegisterService(Rohita empBean)
	{
		boolean result;
		if(empBean.getAge()>18)
		{
			 result = empObj.employeeRegisterDao(empBean);
			 return result;
		}
		else
		{
			//throw new AgeException
			return false;
		}
		
	}

	public List<Rohita> displayEmpDetailsService(int age)
	{
		return (empObj.displayEmpDetailsDao(age));
	}
	

}

