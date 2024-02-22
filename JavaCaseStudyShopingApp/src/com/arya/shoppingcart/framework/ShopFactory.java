package com.arya.shoppingcart.framework;

public abstract class ShopFactory {
     public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isprime);
     public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
}
