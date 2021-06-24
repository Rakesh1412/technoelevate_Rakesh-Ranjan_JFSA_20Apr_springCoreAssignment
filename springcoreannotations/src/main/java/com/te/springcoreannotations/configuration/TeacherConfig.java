package com.te.springcoreannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotations.beans.Teacher;

@Configuration
public class TeacherConfig {

	@Bean(name = "first")
	public Teacher getTeacher() {
		Teacher teacher= new Teacher();
		teacher.setId(101);
		teacher.setName("Anita");
		teacher.setSubject("GS");
		return teacher;
	}
	
	@Bean(name = "second")
	public Teacher getTeacherGk() {
		return new Teacher(101, "Rahul", "Gk");
	}
	
	@Primary
	@Bean(name = "third")
	public Teacher getTeacherMaths() {
		return new Teacher(101, "Mohan", "Maths");
	}
	
}
