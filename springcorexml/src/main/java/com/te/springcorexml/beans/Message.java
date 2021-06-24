package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class Message implements Serializable {
	private String msg;
	
	public Message(){
		System.out.println("instantiation phase");
	}
	
	public void init() {
		System.out.println("init phase");
	}
	
	public void destroy() {
		System.out.println("destroying the world");
	}

}
