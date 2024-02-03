package com.arya.interfacetypes.functional;

@FunctionalInterface
public interface AirthmaticOperation {
	int operation(int a, int b);
	
//	object class method is allowed
	String toString();
//	void operation1();
}
