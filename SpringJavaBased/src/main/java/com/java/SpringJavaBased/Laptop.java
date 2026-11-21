package com.java.SpringJavaBased;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("Compiled on Laptop");
		
	}

}
