package skill;

import java.util.*;

public class Solution3 {

	public static void main(String[] args) {
		
		long answer = 0;
		
		int a;
		int b;
		int a_r;
		int b_r;
		
		a= 5;
		b= 3;
		a_r = a;
		b_r = b;
		
		if(a > b) {
			a = b_r;
			b = a_r;
		}
		
		for (int i = a; i <= b; i++) {
			answer = answer + i;
		}
		
		System.out.println("answer ==>" + answer);
		
		
	}
		   
}
