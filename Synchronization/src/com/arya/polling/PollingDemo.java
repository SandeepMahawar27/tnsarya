package com.arya.polling;

import com.arya.polling.consumer.Consumer;
import com.arya.polling.resurce.PrintString;
import com.arya.polling.suplier.Supplier;

public class PollingDemo {
       public static void main(String[] args) {
    	   PrintString printstring = new PrintString();
    	   Consumer consumer = new Consumer(printstring);
    	   Supplier supplier = new Supplier(printstring);
    	   
    	   Thread consumerThread = new Thread(consumer); 
    	   Thread supplierThread = new Thread(supplier); 
    	   
    	   consumerThread.start();
    	   supplierThread.start();
       } 
}
