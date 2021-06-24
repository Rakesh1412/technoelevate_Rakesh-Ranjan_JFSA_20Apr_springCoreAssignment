package com.te.springcoreannotations.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeBean implements Serializable {

	private int id;

	private String name;
	
	@Autowired(required = false)
	@Qualifier("sales")
	private Department department;

	public EmployeeBean() {
	}
	
}
