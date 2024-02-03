package com.arya.encapsulation;
import com.arya.encapsulation.entites.Students;


public class MainStudent {
      public static void main(String[] args) {
    	  Students student = new Students();
    	  
    	  student.setRollNo(1);
    	  student.setName("sandeep");
    	  student.setAge((byte)20);
    	  
//    	  System.out.println("RollNo:" + student.getRollNo());
//    	  System.out.println("Name:" + student.getName());
//    	  System.out.println("Age:" + student.getAge());
    	  System.out.println(student);
;      }
}
  