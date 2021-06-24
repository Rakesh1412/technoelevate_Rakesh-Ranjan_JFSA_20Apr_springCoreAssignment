package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.Mobile;
import com.te.springcoreannotations.configuration.MobileConfig;

public class MobileTeat {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile mobile = context.getBean(Mobile.class);
		System.out.println(mobile.getDisplay().getType());
		System.out.println(mobile.getDisplay().getResolution());
		System.out.println(mobile.getSoftware().getAndroidVersion());
		System.out.println(mobile.getSoftware().getUi());
		
	}

}
