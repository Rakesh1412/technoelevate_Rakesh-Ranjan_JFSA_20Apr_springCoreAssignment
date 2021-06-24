package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.EmployeeBean;
import com.te.springcorexml.beans.Mobile;
import com.te.springcorexml.beans.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeBean employeeBean = context.getBean("empOne", EmployeeBean.class);
		
		System.out.println("----- contructor ------");
		System.out.println(employeeBean.getName());
		System.out.println(employeeBean.getId());
		System.out.println(employeeBean.getDept().getDname());
		
		System.out.println("--- Property ---");
		EmployeeBean employeeBean2 = context.getBean("empTwo", EmployeeBean.class);
		System.out.println(employeeBean2.getName());
		System.out.println(employeeBean2.getId());
		System.out.println(employeeBean2.getDept().getDname());
		
		
		System.out.println("-------------------------------");
		
		
		Student student=context.getBean("student", Student.class);
		System.out.println(student.getName());
		System.out.println(student.getTeacher().getSubject());
		
		
		System.out.println("--------------------------------");
		
		Mobile mobile=context.getBean("mobile", Mobile.class);
		System.out.println(mobile.getName());
		System.out.println(mobile.getOs().getRam());
		System.out.println(mobile.getOs().getProcessor());
		
	}

}
