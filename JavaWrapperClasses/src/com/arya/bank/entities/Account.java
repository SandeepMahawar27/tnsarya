package com.arya.bank.entities;

public class Account implements Valid{
       private int accountN0;
       private String name;
       private  float balance;
       
	public int getAccountN0() {
		return accountN0;
	}
	public void setAccountN0(int accountN0) {
		this.accountN0 = accountN0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Account(int accountN0, String name, float balance) {
		super();
		this.accountN0 = accountN0;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountN0=" + accountN0 + ", name=" + name + ", balance=" + balance + "]";
	}       
}
