package com.computer.ComputerSpringProject;

public class Alien {
	
	private Computer comm;
	
	public Alien()
	{
		System.out.println("Alien Object");
	}
	



	public Alien(Computer comm) {
		super();
		this.comm = comm;
	}




	public Computer getComm() {
		return comm;
	}


	public void setComm(Computer comm) {
		this.comm = comm;
	}
	
	
	public void code()
	{
		System.out.println("Codding");
		comm.compile();
	}

}
