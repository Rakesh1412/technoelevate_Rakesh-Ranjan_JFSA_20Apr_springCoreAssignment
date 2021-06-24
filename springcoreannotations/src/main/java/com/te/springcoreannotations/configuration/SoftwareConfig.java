package com.te.springcoreannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Software;

@Configuration
public class SoftwareConfig {
	
	@Bean
	public Software getSoftware() {
		return new Software(10,"neon");
	}
}
