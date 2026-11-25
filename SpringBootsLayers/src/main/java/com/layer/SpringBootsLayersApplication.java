package com.layer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.layer.model.Alien;
import com.layer.model.Laptop;
import com.layer.service.LaptopService;

@SpringBootApplication
public class SpringBootsLayersApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootsLayersApplication.class, args);
		
		Alien alien= context.getBean(Alien.class);
		alien.code();
		
		
		Laptop laptop=context.getBean(Laptop.class);
		
		LaptopService service=context.getBean(LaptopService.class);
		service.addLap(laptop);
	}

}
