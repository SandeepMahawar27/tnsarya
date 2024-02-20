package com.arya.multithreading.lifecycle;

public class LifeCycle {

	public static void main(String[] args) {
		PrintTable print = new PrintTable(2);
//		PrintTable print1 = new PrintTable(3);
		Thread thread = new Thread(print);
//		Thread thread1 = new Thread(print1);
		
		System.out.println(thread.getState());
		System.out.println(thread.isAlive());
//		thread.setName("Thread1");
		thread.setPriority(1);
		thread.start();
		
		System.out.println(thread.isAlive());
		if(thread.isAlive()) {
			try {
				Thread.sleep(0);
				System.out.println(thread.getState());
				thread.join();   // thread will join method execution
				System.out.println(thread.getState());
			}catch(InterruptedException e) {
				e.printStackTrace(); 
			}
			
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread.isAlive());
		System.out.println("Before join method");
	}
}
