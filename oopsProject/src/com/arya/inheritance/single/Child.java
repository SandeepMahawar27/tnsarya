package com.arya.inheritance.single;

public class Child extends Parent{ 
      String lastName;
  
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Child() {
		super();
	}
	// Variable Shadiwing
	
	public Child(String firstName, String lastName) {
		super(firstName);
 	   this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "Child [lastName=" + lastName + ", firstName=" + firstName + "]";
	}  
}
