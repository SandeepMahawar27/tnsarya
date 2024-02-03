package com.arya.inheritance.single;

public class Parent {
        String firstName;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
       public Parent(String firstName) {
    	   this.firstName = firstName;
       }
       public Parent() {
    	   
       }

	@Override
	public String toString() {
		return "Parent [firstName=" + firstName + "]";
	}    
}
