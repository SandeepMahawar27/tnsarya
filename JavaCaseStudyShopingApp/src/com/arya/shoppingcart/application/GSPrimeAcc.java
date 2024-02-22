package com.arya.shoppingcart.application;

import com.arya.shoppingcart.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges, isprime);
	}

	@Override
	public void bookProduct(float charges) {
		
	}

	@Override
	public void items(float charges) {

	}
}
