package com.te.springcoreannotations.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable {

	public Student() {
		super();
	}

	private int rn;
	private String name;
	
	@Autowired(required = false)
//	@Qualifier("first")           //used to set using bean name(byName), by default its byType
	private Teacher teacher;
}
