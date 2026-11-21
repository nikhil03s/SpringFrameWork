package com.java.SpringJavaBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

	public Desktop() {
		// TODO Auto-generated constructor stub
		System.out.println("Object Created for Desktop");
	}
	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("Compiled on Desktop");
	}

}
