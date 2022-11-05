package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String engineComp;

	Engine(){
		System.out.println("Engine class Constructor");
	}

	@Override
	public String toString() {
		return "Engine [engineComp=" + engineComp + "]";
	}

	public String getEngineComp() {
		return engineComp;
	}

	public void setEngineComp(String engineComp) {
		this.engineComp = engineComp;
	}

	
}
