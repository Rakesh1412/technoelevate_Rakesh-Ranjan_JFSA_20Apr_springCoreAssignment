package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.Student;
import com.te.springcoreannotations.configuration.StudentConfig;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = context.getBean(Student.class);
		System.out.println(student.getRn());
		System.out.println(student.getName());
		System.out.println(student.getTeacher().getId());
		System.out.println(student.getTeacher().getName());
		System.out.println(student.getTeacher().getSubject());

	}

}
