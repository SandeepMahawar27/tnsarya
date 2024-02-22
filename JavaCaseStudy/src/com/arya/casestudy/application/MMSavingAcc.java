package com.arya.casestudy.application;

import com.arya.casestudy.freamwork.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance, isSalaried);
		// TODO Auto-generated constructor stub
	}
     
	@Override
	public void withdraw(float amount) {
		float oldAccountBalance = getAccountBalance();
		float newAccountBalance = 0.0f;
		if(getMinBal() < oldAccountBalance-amount) 
			newAccountBalance = oldAccountBalance-amount;
		else {
			System.out.println("Insufficient funds.");
			newAccountBalance=oldAccountBalance;
		}
		setAccountBalance(newAccountBalance);
		System.out.println("Balance:" + newAccountBalance);
	}


	@Override
	public void deposit(float amount) {
		float oldAccountBalance = getAccountBalance();
		float newAccountBalance = oldAccountBalance+amount;
		setAccountBalance(newAccountBalance);
		
		System.out.println("Balace:" + newAccountBalance);
	}
}
