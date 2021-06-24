package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeBean emp= context.getBean("employee", EmployeeBean.class);
		System.out.println("Employee ID : "+emp.getId());
		System.out.println("Employee Name : "+emp.getName());
		System.out.println("Department ID : "+emp.getDept().getDid());
		System.out.println("Department Name : "+emp.getDept().getDname());
	}

}
