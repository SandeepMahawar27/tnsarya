package com.arya.student.crudapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.arya.student.crudapp.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private String query;
	
	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "8113");
	}

	@Override
	public String insertStudent(Student student) throws ClassNotFoundException, SQLException {
		query = "INSERT INTO students(name,phoneNo) values(?,?)";
		try(
				Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				) {
			statement.setString(1, student.getName());
			statement.setString(2, student.getPhoneNo());
			statement.execute();
			return "Inserted Successfully"; 
			
		}
//		return "Problem occured while inserted record.";
	}

	@Override
	public String updateStudent(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectStudent(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
