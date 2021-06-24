package com.te.springcoreannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotations.beans.Student;
import com.te.springcoreannotations.beans.Teacher;

@Configuration
@Import(TeacherConfig.class)
public class StudentConfig {
	
	@Bean
	public Student getStudent() {
		Student student=new Student();
		student.setName("Ram");
		student.setRn(1);
//		student.setTeacher(new Teacher());
		return student;
	}

}
