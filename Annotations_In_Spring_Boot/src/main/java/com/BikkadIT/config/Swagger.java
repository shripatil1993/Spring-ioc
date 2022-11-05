package com.BikkadIT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Swagger {
	public Swagger() {
		super();
		System.out.println("Swagger class Constructor");
	}

	@Bean
	public SecurityConfig getSecurityConfig() {
		SecurityConfig securityConfig=new SecurityConfig();
		return securityConfig;
	}

}
