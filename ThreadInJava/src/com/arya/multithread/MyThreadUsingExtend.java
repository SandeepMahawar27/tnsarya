package com.arya.multithread;

// Creating thread using Thread class
public class MyThreadUsingExtend extends Thread{
        public void run() {
        	//task for thread
        	for(int i=10; i>=1; i--) {
        		System.out.println("another thread = " + i);
        		
        		try {
        			Thread.sleep(1000);
        		}catch(Exception e) {
        			
        		}
        	}
        }
        
        public static void main(String[] args) {
        	MyThreadUsingExtend t = new MyThreadUsingExtend();
        	t.start();
        }
}
