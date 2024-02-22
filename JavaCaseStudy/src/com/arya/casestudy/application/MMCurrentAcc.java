package com.arya.casestudy.application;

import com.arya.casestudy.freamwork.CurrentAcc;

public  class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		float creditLimit = getCreditLimit();
		float oldAccountBalance = getAccountBalance();
		float newAccountBalance=0;
		if(amount < (oldAccountBalance+creditLimit)) {
			newAccountBalance = oldAccountBalance-amount;
			setAccountBalance(newAccountBalance);
		}else
			System.out.println("Insuffiecient fund.");
		
		System.out.println("Balance:" + (newAccountBalance+creditLimit));
		System.out.println("Credit Limit:" + creditLimit);
	}

	@Override
	public void deposit(float amount) {
		float oldAccountBalance = getAccountBalance();
		float newAccountBalace = oldAccountBalance+amount;
		setAccountBalance(newAccountBalace);
		
		System.out.println("Balance:" + newAccountBalace);
		
	}
}
