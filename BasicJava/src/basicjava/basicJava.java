package basicjava;

import java.util.Scanner;

public class basicJava {
        public static void main(String[] args) {
        	System.out.println("hiii sandeep");
        	String a = "abc";
        	String b = " ggg";
        	
        	String c = Adder.add(a,b);
            System.out.println(c);
            Scanner myObj = new Scanner(System.in);                 
            System.out.println("Enter username"); 

            String userName = myObj.nextLine(); 
            System.out.println("Username is: " + userName);
		}                                                  
        
        // command pattern
        class Faredatal{
        	String name;
        }
        
        class TrainService{
        	int calculatefare(Faredatal faredata ) {
        		return 0;
        	}
        }
       
     class User{
    	 private int id;
    	 private int age;
    	 
    	 //control to set the value
    	 public void setAge(int age) {
    		 if(age>=0) {
    			 this.age = age;
    		 }
    	 }
     }
     
//     dynamic poly: method overloading
//     static poly: method overloading
     
//     Service:Services: API (methods) 
     
    class Adder{
    	 public static int add(int a, int b) {
        	 return a + b;
         }
         public static String add(String a, String b) {
        	 return a + b;
         }
         public static int add(int a, int b, int c) {
        	 return a + b + c; 
         }
    }
} 

// Abstraction: 
