package com.arya.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

public class JdbcDemo {
        public static void main(String[] args) {
        	String url = "jdbc:mysql://localhost:3306/demodb";
        	String userName = "root";
        	String password = "8113";
        	// sun.jdbc.odbc.JDBCODBCDriver;   JDBC ODBC bridge Drivers
        	// oracle.jdbc.oracleDriver // Native Drivers
        	// com.ibm.ibm2.jdbc.net.DB2Driver // network Api Driver
        	// com.mysql.cj.jdbc.Driver // Think Driver or Direct 2 DataBase Driver
        	
        	try {
        		// Loading class into JVM
        		
        		Class.forName("com.mysql.cj.jdbc.Driver");
//        		Students student = new Students(2, "Sandy", 23);
        		Connection connection = DriverManager.getConnection(url, userName, password);
//        		PreparedStatement statement = connection.prepareStatement("INSERT INTO students(id,name,age) values(?,?,?)");
//        		statement.setInt(1, student.getId());
//        		statement.setString(2, student.getName());
//        		statement.setInt(3, student.getAge());
//        		statement.execute();
//        		
//        		List<Students> studentList = new ArrayList<>();
//        		PreparedStatement statement = 
//        				connection.prepareStatement("SELECT * FROM students"); 
//        		ResultSet studentRecords = statement.executeQuery();
//        		while(studentRecords.next()) {
//        			studentList.add(new Students(
//        					studentRecords.getInt(1),
//        					studentRecords.getString(2),
//        					studentRecords.getByte(3)
//        					));
//        		}
//        			
//        		System.out.println(studentList);
        		
        		CallableStatement statement = 
       				connection.prepareCall("call delete_students(?)"); 
        		statement.setInt(1, 2);
        		statement.execute();   		
        			System.out.println("Deleted Successfully...");        
        		
        	}catch(ClassNotFoundException e) {
        		e.printStackTrace();
        	} catch (SQLException e) {
        		System.out.println("Connection Issues..");
				e.printStackTrace();
			}
        }
}
