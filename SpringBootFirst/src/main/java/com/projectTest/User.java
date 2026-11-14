package com.projectTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Autowired
	Laptop laptop;

	public void code() {
		laptop.compile();
		System.out.println("Coding...");}

}
