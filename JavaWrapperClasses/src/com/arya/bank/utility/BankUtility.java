package com.arya.bank.utility;

import com.arya.bank.entities.Account;
import com.arya.bank.entities.Valid;
import com.arya.bank.interfaces.Bank;

public class BankUtility {

	public String deposit (Account  account , float amountt) {
		Bank bankDeposit =(acc , amount )->{
			if(amountt<= Bank.DEPOSITE_LIMIT) {
				acc.setBalance(acc.getBalance()+amount);
				return "sucess";
			}
			else
			{
				return "Unsuccssfull  Transaction..";
			}
		};
		if(account instanceof Valid)
			
			return bankDeposit.transaction(account, amountt);
		else
			return " Invalid account";
			
	}
	
	public String Withdraw (Account  account , float amountt) {
		Bank bankWithdraw =(acc , amount )->{
			if(amountt<= Bank.DEPOSITE_LIMIT) {
				acc.setBalance(acc.getBalance()+amount);
				return "sucess";
			}
			else
			{
				return "Unsuccssfull  Transaction..";
			}
		};
		if(account instanceof Valid)
			
			return bankWithdraw.transaction(account, amountt);
		else
			return " Invalid account";
			
	}
}
