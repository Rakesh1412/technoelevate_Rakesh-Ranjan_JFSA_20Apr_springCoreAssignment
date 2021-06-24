package com.te.springcoreannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Display;

@Configuration
public class DisplayConfig {
	
	@Bean
	public Display getDisplay() {
		return new Display("Amoled",2048);
	}
}
