package com.arya.interfacetype;

import com.arya.interfacetypes.functional.*;

public class FunctionalInterfaceApp {
	public static void main(String[] args)  {
		AirthmaticOperation addition = new Addition();
		int result = addition.operation(10,20);
		System.out.println(result);	
		
		AirthmaticOperation subtract = new SubStraction();
		int result2 = subtract.operation(20, 10);
		System.out.println(result2);	
	}
}