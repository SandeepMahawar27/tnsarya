package com.arya.geneics;

public class PrintString {
    private String name;

	public PrintString(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PrintString [name=" + name + "]";
	}
    
}
