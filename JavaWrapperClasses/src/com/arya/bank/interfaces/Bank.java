package com.arya.bank.interfaces;

import com.arya.bank.entities.Account;

@FunctionalInterface
public interface Bank {
	
	float MIN_BALANCE = 1000;
	float DEPOSITE_LIMIT = 20000;
	
	String transaction(Account acc, float amountt);
} 
  