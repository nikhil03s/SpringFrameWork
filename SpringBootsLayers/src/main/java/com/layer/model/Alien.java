package com.layer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("22")
	private int age;
	private Computers computers;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Computers getComputers() {
		return computers;
	}
	@Autowired
	public void setComputers(Computers computers) {
		this.computers = computers;
	}
	
	
	public void code() {
		System.out.println("alien code");
		computers.compile();
	}
}
