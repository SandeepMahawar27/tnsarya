package com.arya.synchronize;

import com.arya.synchronize.printmethod.PrintMessage;

public class SynchronizationDemo {
           public synchronized static void main(String[] args) {
        	   PrintMessage print = new PrintMessage();
        	   Thread thread1 = new Thread(print, "Thread1");
        	   Thread thread2 = new Thread(print, "Thread2");
        	   Thread thread3 = new Thread(print, "Thread3");
        	   
        	   thread1.start();
        	   thread2.start(); 
        	   thread3.start();
           }
}
