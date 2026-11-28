package com.springs.SrpingJDBCEx.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springs.SrpingJDBCEx.model.Student;

@Repository
public class StudentRepo {
	
	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student student)
	{
	
		String sql="insert into student(rollno,name,marks) values (?,?,?)";
     int row	=	jdbc.update(sql,student.getRollNo(),student.getName(),student.getMarks());
		
		System.out.println(row+"Effected  Saved");
	}

	public List<Student> finAll() {
		// TODO Auto-generated method stub
		String sql="select * from student";
//		RowMapper<Student> rowMapper=( rs, rowNum) ->{
//				// TODO Auto-generated method stub
//				Student s=new Student();
//				s.setRollNo(rs.getInt("rollno"));
//				s.setName(rs.getString("name"));
//				s.setMarks(rs.getInt("marks"));
//				return s;
//		};

		return jdbc.query(sql, ( rs, rowNum) ->{
				// TODO Auto-generated method stub
				Student s=new Student();
				s.setRollNo(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setMarks(rs.getInt("marks"));
				return s;
		});
	}
}
