package com.arya.student.crudapp.entities;

import java.sql.SQLException;
import com.arya.student.crudapp.services.StudentService;
import com.arya.student.crudapp.dao.StudentDaoImpl;
import com.arya.student.crudapp.dao.StudentDao;

public class StudentServicesImpl implements StudentService {
	
	StudentDao studentDao = new StudentDaoImpl();
	
    @Override
    public String insertStudent(Student student) {
        try {
            return studentDao.insertStudent(student);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return "Problem occurred during insert ";
        }
    }

}
