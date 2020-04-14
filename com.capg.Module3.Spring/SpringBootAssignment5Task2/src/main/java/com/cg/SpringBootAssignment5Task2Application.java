package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

@SpringBootApplication
public class SpringBootAssignment5Task2Application {

	@Autowired
	private IEmpDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment5Task2Application.class, args);
	}

	public void run(String... args) throws Exception{
		List<Emp> lst=dao.viewEmp();
		lst.forEach(System.out::println);
	}
}
