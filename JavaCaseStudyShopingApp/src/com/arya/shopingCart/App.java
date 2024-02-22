package com.arya.shopingCart;

import com.arya.shoppingcart.application.GSShopFactory;
import com.arya.shoppingcart.framework.ShopFactory;
import com.arya.shoppingcart.framework.ShopAcc;

public class App {
   public static void main(String[] args) {
	   ShopFactory factory = new GSShopFactory();
	   ShopAcc normalAccount = factory.getNewNormalAcc(101, "sandeep", 1000, 100);
	   
	   normalAccount.bookProduct(20);
	   normalAccount.items(2);
	   
	   System.out.println(normalAccount);
	    
	   ShopAcc PrimeAccount = factory.getNewPrimeAcc(102, "mahawar", 2000, true);
	   
	   System.out.println(PrimeAccount);
	   
   }
}
