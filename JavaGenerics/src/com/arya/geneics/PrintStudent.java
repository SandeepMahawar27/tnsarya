package com.arya.geneics;

public class PrintStudent {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "PrintStudent [student=" + student + "]";
	}

	public PrintStudent(Student student) {
		super();
		this.student = student;
	}
	
}
