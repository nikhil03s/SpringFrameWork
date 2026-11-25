package com.layer.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computers{
	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("Laptop Compiling.");
	}

}
