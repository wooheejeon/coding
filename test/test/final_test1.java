package test;

import java.util.*;
import java.util.Map.Entry;

class final_test1 {
	
	public static void main(String[] args) {
		
		int number;
		number = 7;
		String str = "";
		
	  int []b = new int[32];
	   
	  int i = 0;
	  while(number != 1)
	  {
	   b[i++] = number%2;
	   number = number/2;
	  }
	  b[i] = number;
	   
	  for(int j = i; j >= 0; --j)
	  {
	   str = str+b[j];
	  }  
	  
	  int count = 0;

        for (int j=0; j<str.length(); j++) {

               if (str.charAt(j) == '1') {

                       count++;

                }

        }
        
        System.out.println(count);

		return;
		
	}

	
}