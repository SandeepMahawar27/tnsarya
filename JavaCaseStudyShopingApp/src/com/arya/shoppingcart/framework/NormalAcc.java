package com.arya.shoppingcart.framework;

public abstract class NormalAcc extends ShopAcc{
   
	private final float deliveryCharges = 150;

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public NormalAcc() {

	} 

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}

	@Override
	public void bookProduct(float charges) {
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getDeliveryCharges()=" + getDeliveryCharges()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]"; 
	}	
}
