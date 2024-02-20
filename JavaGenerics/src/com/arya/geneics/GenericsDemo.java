package com.arya.geneics;

public class GenericsDemo {
      public static void main(String[] args) {
//    	  PrintInteger printInteger = new PrintInteger(10);
//    	  System.out.println(printInteger);
//    	  
//    	  PrintString printstring = new PrintString("Sandeep");
//    	  System.out.println(printstring);
//    	  
//    	  Student student = new Student(1,"ABC");
//    	  PrintStudent printStudent = new PrintStudent(student);
//    	  printStudent.setStudent(student);
    	  
    	  GenericClass<Integer> integerPrint = new GenericClass<>(10);
    	  //type safty
//    	  integerPrint.printObject(10);
    	  // no explicit casting is needed
    	  
    	  int number = integerPrint.getObj();
    	  
    	  GenericClass<String> stringPrint = new GenericClass<>("SANDEEP");
    	  stringPrint.printObject("SANDEEP");
    	  String message = stringPrint.getObj();
    	  
    	  GenericClass<Student> studentPrint = new GenericClass<>(new Student(102, "Hii Sandy"));
    	  studentPrint.printObject(new Student(102, "SANDEEP"));
    	  Student student = studentPrint.getObj();
    	  
      }
}
