package com.arya.multithreading.lifecycle;

public class PrintTable implements Runnable{
	
	    int number;

		public PrintTable(int number) {
		super();
		this.number = number;
	   }
		public void printtable() {
        	 for(int i=1; i<11; i++) {
        		 System.out.println(i*number);
        	 }
         }



		@Override
		public void run() {
			printtable();		
		}
}
