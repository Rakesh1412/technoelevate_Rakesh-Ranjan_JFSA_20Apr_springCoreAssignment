package com.te.springcoreannotations.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher implements Serializable {
	public Teacher() {
		super();
	}

	private int id;
	private String name;
	private String subject;

}
