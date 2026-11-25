package com.layer.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computers {
	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("Desktop compiling");
	}
}
