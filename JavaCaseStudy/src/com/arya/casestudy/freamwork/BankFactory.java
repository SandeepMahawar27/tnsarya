package com.arya.casestudy.freamwork;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int accountNumber, String accountName, float accountBalance, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accountNumber, String accountName, float accountBalance, float creditLimit);
}
 