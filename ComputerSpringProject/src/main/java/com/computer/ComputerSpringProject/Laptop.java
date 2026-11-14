package com.computer.ComputerSpringProject;

public class Laptop implements Computer{
	public Laptop() {
		System.out.println("Laptop Object");
	}
	@Override
	public void compile() {
		// TODO Auto-generated method stub
	System.out.println("Compileing from Laptop");	
	}

}
