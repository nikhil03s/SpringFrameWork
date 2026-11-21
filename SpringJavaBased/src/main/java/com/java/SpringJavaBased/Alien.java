package com.java.SpringJavaBased;


public class Alien {
	private int id;
	private String name;
	
	Computer computer;
	
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}
	
	public void code() {
		System.out.println("Aline code");
		computer.compile();
	}
	
}
