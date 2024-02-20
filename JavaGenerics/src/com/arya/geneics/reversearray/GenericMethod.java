package com.arya.geneics.reversearray;

import java.util.Arrays;

public class GenericMethod {
      public static void main(String[] args) {
    	  Integer[] integerArray = {1,2,3,4,5};
          String[] stringArray = {"sandeep", "sunil", "sunita", "rahul"};
          
          printArray(integerArray);
          printArray(stringArray);
      }
      
      public static <T> void printArray(T[] objArray) {
    	  System.out.println(Arrays.toString(objArray));
      }
}
