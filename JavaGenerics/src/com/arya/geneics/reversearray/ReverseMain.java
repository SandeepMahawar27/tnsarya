package com.arya.geneics.reversearray;

import java.util.Arrays;

public class ReverseMain {
	 public static void main(String[] args) {
	        Integer[] inArray = new Integer[] {1,2,3,4,5};
	        System.out.println(Arrays.toString(inArray));
	        ReverseArray<Integer> integerArray = new ReverseArray<>(inArray);
	        integerArray.reverse();
	        System.out.println(Arrays.toString(inArray));
	        
	        String[] strArray = new String[] {"Sandeep", "Rahul", "Athrav", "Suhani"};
	        System.out.println(Arrays.toString(strArray));
	        ReverseArray<String> stringArray = new ReverseArray<>(strArray);
	        stringArray.reverse();
	        System.out.println(Arrays.toString(strArray));
	    }
} 
