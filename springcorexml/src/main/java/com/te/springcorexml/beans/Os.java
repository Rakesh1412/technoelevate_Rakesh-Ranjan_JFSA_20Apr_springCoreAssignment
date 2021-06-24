package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Os implements Serializable {
	private String processor;
	private int ram;
	public Os() {
		super();
	}

}
