package com.arya.casestudy.application;

import com.arya.casestudy.freamwork.BankFactory;

public class MMBankFactory extends BankFactory{

	@Override
	public MMSavingAcc getNewSavingAcc(int accountNumber, String accountName, float accountBalance,
			boolean isSalaried) {
		
		return new MMSavingAcc(accountNumber, accountName, accountBalance, isSalaried);
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accountNumber, String accountName, float accountBalance,
			float creditLimit) {
		
		return new MMCurrentAcc(accountNumber, accountName, accountBalance, creditLimit) ;
	}
    
	 

}

