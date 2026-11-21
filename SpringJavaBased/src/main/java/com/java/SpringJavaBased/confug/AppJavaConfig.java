package com.java.SpringJavaBased.confug;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.java.SpringJavaBased.Alien;
import com.java.SpringJavaBased.Computer;
import com.java.SpringJavaBased.Desktop;
import com.java.SpringJavaBased.Laptop;

@Configuration
public class AppJavaConfig {
	
	
	@Bean
	public Alien alien(Computer computer) {
		Alien obj=new Alien();
		obj.setComputer(computer);
		return obj; }
	
	@Bean(name = "com1") //{"com1","desktop"}
//	@Scope("prototype")
	public Desktop desktop() {
		return  new Desktop();
	}
	
	@Bean
	@Primary
	public Laptop laptop() { return new Laptop(); }

}
