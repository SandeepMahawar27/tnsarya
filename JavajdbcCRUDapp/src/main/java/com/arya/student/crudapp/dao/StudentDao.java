package com.arya.student.crudapp.dao;

import java.sql.SQLException;

import com.arya.student.crudapp.entities.Student;

public interface StudentDao {
	String insertStudent(Student student) throws ClassNotFoundException, SQLException;
	String updateStudent(int rollNo);
	String selectStudent(int rollNo);
	String deleteStudent(int rollNo);

}
