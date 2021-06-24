package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mobile implements Serializable {
	private int id;
	private String name;
	private Os os;
	
	public Mobile() {
		super();
	}
}
