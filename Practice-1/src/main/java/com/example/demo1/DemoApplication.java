package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo1.s.Car;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	 
	Car c  =context.getBean(Car.class);
	c.setCarname("Maruti");
	c.getEngine().setEngineComp("Tata");
	System.out.println(c);
		
		
	}

}
