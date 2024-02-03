package com.arya.bank;

import com.arya.bank.entities.Account;
import com.arya.bank.interfaces.Bank;

public class BankApp {
	public static void main(String[] args) {
		Account account = new Account(1001, "sandeep", 10000);
		float amount = 10000;
		
		 Bank sbiDeposite = ( acc,  amountt) ->  {
			 if(amount <= Bank.DEPOSITE_LIMIT) {
				 acc.setBalance(acc.getBalance() + amountt);
				 return "Sucess";
			 }else {
				 return "Unsuccessfully Transaction...";
			 }
		 };
		 Bank sbiWithdraw = ( acc,  amountt) -> {
			 if(Bank.MIN_BALANCE < acc.getBalance() - amountt) {
				 acc.setBalance(acc.getBalance() - amountt);
				 return "Sucess";
			 }else {
				 return "Unsuccessfully Transaction...";
			 } 
		 };
		 
		 String depositeMessage = sbiDeposite.transaction(account, amount);
		 if(depositeMessage == "Sucess") {
			 System.out.println(account);  
		 }
		 else {
			 System.out.println(depositeMessage);
		 }
		 String withdrwMessage = sbiWithdraw.transaction(account, 99000);
		 if(withdrwMessage == "Successful") {
			 System.out.println(account); 
		 }else {
			 System.out.println(withdrwMessage); 
		 }

	} 

}
