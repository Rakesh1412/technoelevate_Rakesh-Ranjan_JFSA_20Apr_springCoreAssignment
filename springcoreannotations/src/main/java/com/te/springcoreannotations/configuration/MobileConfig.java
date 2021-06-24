package com.te.springcoreannotations.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ DisplayConfig.class, SoftwareConfig.class })
@ComponentScan("com.te.springcoreannotations")
public class MobileConfig {
	
	
	
}
