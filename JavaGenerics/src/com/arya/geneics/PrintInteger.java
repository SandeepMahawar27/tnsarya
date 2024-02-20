package com.arya.geneics;

public class PrintInteger {
    private Integer rollNo;

	public PrintInteger(Integer rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "PrintInteger [rollNo=" + rollNo + "]";
	}
    
}
