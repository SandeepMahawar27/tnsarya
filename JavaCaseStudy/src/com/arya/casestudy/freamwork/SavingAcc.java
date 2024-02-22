package com.arya.casestudy.freamwork;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    private static final float MIN_BAL = 500;
    
	public SavingAcc(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance);
		this.isSalaried = isSalaried;
	}
     
	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinBal() {
		return MIN_BAL; 
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountName()=" + getAccountName() + ", getAccountBalance()="
				+ getAccountBalance() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

    
}
