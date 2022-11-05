package com.Bikkad.IT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"in.bikkadIt","com.bikkadIt"})

public class ComponentScanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanningApplication.class, args);
	}
}
