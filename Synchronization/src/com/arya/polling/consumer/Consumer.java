package com.arya.polling.consumer;

import com.arya.polling.resurce.PrintString;

public class Consumer implements Runnable{
     PrintString printString;
     
     
     public Consumer(PrintString printString) {
		super();
		this.printString = printString;
	}

	public void getMessage() { 
    	 String name = null;
    	 do {
    		 name = printString.getString();
    		 System.out.println("get: " + name); 
    	 }while(!name.equals("0"));
     }  
     
     public void run() {
    	 getMessage();
     }
}
