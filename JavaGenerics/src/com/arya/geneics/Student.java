package com.arya.geneics;

public class Student {
      private int rollNo;
      private String name;
	public Student(int i, String string) {
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) { 
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
      
}
