package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.Message;

public class MsgTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("messageConfig.xml");
		Message msg=context.getBean("test", Message.class);
		System.out.println(msg.getMsg());
		msg.destroy();

	}

}
