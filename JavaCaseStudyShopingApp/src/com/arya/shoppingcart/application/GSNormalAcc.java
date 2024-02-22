package com.arya.shoppingcart.application;

import com.arya.shoppingcart.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
 
	@Override
	public void items(float charges) {
	
	}

	@Override
	public void bookProduct(float charges) {
        
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges()
		+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ "]";

	}
}
