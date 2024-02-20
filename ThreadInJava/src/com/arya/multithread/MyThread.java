package com.arya.multithread;

// creating our thread using Runnable Interface
public class MyThread implements Runnable{
         public void run() {
        	 //task for thread
        	 for(int i=1; i<=10; i++) {
        		 System.out.println("Value of i is:" + i);
        		 try {
        			 Thread.sleep(1000);
        		 }catch(Exception e) {
        			 
        		 }
        	 }
         }
         public static void main(String[] args) {
        	 //create object of MyThread class
        	 MyThread t = new MyThread(); 
        	 Thread thread = new Thread(t);
        	 MyThreadUsingExtend t2 = new MyThreadUsingExtend();
         	 t2.start();
         	 thread.start();
         }
}
