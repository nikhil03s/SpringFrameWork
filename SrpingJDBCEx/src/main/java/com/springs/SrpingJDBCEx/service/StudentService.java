package com.springs.SrpingJDBCEx.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springs.SrpingJDBCEx.model.Student;
import com.springs.SrpingJDBCEx.repo.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo repo;

	public StudentRepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void addStudent(Student student)
	{
		System.out.println("Adding stundent to the database........");
		repo.save(student);
	}

	public List<Student> getStudent() {

		return repo.finAll();
	}

}
