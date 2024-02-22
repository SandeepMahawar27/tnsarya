package com.arya.casestudy;

import com.arya.casestudy.freamwork.BankAcc;
import com.arya.casestudy.freamwork.BankFactory;
import com.arya.casestudy.application.MMBankFactory;

public class App {
	public static void main(String[] args) {
		BankFactory factory= new MMBankFactory(); 
		BankAcc savingAccount = factory.getNewSavingAcc(1001, "Sandeep", 1000, true);
		
		savingAccount.withdraw(100);
		savingAccount.deposit(100); 
		
		BankAcc currentAccount = factory.getNewCurrentAcc(9001, "Mahawar", 2000, 1000);
		currentAccount.withdraw(200);
		currentAccount.deposit(1000);
	}

}
