package com.arya.polling.resurce;

public class PrintString {

	private String msg;
	
	private boolean isReady;

	public synchronized String getString() {
		while(!isReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
		}
		isReady = false; 
		notify();  
		return msg;
	}
 
	public synchronized void setString(String msg) {
		while(isReady) {
			try {
				wait();    // valid in synchronized context only...
			} catch (InterruptedException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.msg = msg;
		System.out.println("Set: " + msg);
		
		isReady = true;
		notify();
	}
	
}
