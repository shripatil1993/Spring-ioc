package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {

private String carname;
	
private Engine engine;

public Car() {
	super();
	System.out.println("Car class Constructor");

	
}

public String getCarname() {
	return carname;
}

public void setCarname(String carname) {
	this.carname = carname;
}

public Engine getEngine() {
	return engine;
}
@Autowired
public void setEngine(Engine engine) {
	System.out.println("Setter of Car Class");
	this.engine = engine;
}

@Override
public String toString() {
	return "Car [carname=" + carname + ", engine=" + engine + "]";
}


	
}
