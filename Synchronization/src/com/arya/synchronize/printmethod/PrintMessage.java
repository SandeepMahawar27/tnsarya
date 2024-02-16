package com.arya.synchronize.printmethod;

public class PrintMessage implements Runnable{
       public void printMessage() {
    	   System.out.print("{");
    	   
    	   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   System.out.print("Hello");
    	   
    	   System.out.print("}");
    	   System.out.println();
       }
       
       public void run() {
    	   synchronized(this) {
    		   printMessage();
    	   }	   
       }
}
