package com.computer.ComputerSpringProject;

public class Desktop implements Computer {
	
	
	public Desktop()
	{
		System.out.println("Desktop Object");
	}
	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("Compileing from desktop");
	}
}
