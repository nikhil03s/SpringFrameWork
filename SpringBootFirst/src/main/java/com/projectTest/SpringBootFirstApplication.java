package com.projectTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.classes.Student;

/**
 * 
 */
@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
//		Student stud = context.getBean(Student.class);
//		stud.setId(1);
//		System.out.println(stud.getId());
		
		User user= context.getBean(User.class);
		user.code();
		
	}

}
