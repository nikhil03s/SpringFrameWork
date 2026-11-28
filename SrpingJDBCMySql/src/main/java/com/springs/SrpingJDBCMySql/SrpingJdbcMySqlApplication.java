package com.springs.SrpingJDBCMySql;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springs.SrpingJDBCMySql.model.Student;
import com.springs.SrpingJDBCMySql.service.StudentService;

@SpringBootApplication
public class SrpingJdbcMySqlApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SrpingJdbcMySqlApplication.class, args);
		
		 
		 Student student=context.getBean(Student.class);
		 
		 student.setRollNo(102);
		 student.setName("Nikhil");
		 student.setMarks(80);
		 
		 StudentService service=context.getBean(StudentService.class);
		 
		 
		 service.addStudent(student);
		 
		 List<Student> show=service.getStudent();
		 System.out.println(show);
	}

}
