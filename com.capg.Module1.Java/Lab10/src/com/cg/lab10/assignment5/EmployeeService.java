package com.cg.lab10.assignment5;

import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService 
{
	EmployeeRepository obj=new EmployeeRepository();
	public double sumOfSalary()
	{
		double sum=obj.listOfEmployee.stream().map(x->x.salary).reduce(0.0, (a,b)->a+b);
		return sum;
	}
	
    public Map<Object, Integer> listOfDepartment()
    {
        Map<Object, Integer> departments = obj.listOfEmployee.parallelStream().map(x->x.department.departmentName).collect(Collectors.toMap(
                key -> key, value -> 1, (a,b)->a+b));
        return(departments);
    }
}
