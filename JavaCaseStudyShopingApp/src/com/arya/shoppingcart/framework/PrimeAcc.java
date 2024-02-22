package com.arya.shoppingcart.framework;

public abstract class PrimeAcc extends ShopAcc{
     private boolean isprime;
     private static final float deliveryCharges = 100;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.isprime = isprime;
	}
	 
	
	public boolean isIsprime() {
		return isprime;
	}

	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	} 

	public static float getDeliverycharges() {
		return deliveryCharges;
	} 
	
	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isprime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getCharges()=" + getCharges() + "]";
	}    
} 
