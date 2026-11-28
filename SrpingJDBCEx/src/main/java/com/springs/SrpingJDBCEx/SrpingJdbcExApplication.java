package com.springs.SrpingJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springs.SrpingJDBCEx.model.Student;
import com.springs.SrpingJDBCEx.service.StudentService;

@SpringBootApplication
public class SrpingJdbcExApplication {

	public static void main(String[] args) {
		 ApplicationContext context= SpringApplication.run(SrpingJdbcExApplication.class, args);
		 
		 Student student=context.getBean(Student.class);
		 
		 student.setRollNo(101);
		 student.setName("Nikhil");
		 student.setMarks(80);
		 
		 StudentService service=context.getBean(StudentService.class);
		 
		 
		 service.addStudent(student);
		 
		 List<Student> show=service.getStudent();
		 System.out.println(show);

	
	}
	

}
