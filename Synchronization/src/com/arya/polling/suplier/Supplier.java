package com.arya.polling.suplier;

import com.arya.polling.resurce.PrintString;

public class Supplier implements Runnable{

	PrintString printstring;
	
	public Supplier(PrintString printstring) {
		super();
		this.printstring = printstring;
	}

	public void setMessage() {
		String msg = "Sandeep, Rahul, Atharv, Govind";
		
		String[] strArray = msg.split(", ");
		for(String name: strArray) {
			printstring.setString(name); 
		}
	}
	
	public void run() {
   	 setMessage();
    }
 
}
