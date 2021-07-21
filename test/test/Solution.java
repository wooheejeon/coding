package test;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		   int answer = 0;
		
		   int[][] borad = {{0,0,0,0,0},
				   			{0,0,1,0,3},
				   			{0,2,5,0,1},
				   			{4,2,4,4,2},
				   			{3,5,1,3,1}};
		   int[] moves = {1,5,3,5,1,2,1,4};
		   
		   Stack<Integer> s = new Stack<Integer>();
		   
		   for (int i = 0; i < moves.length; i++) {
					for(int j = 0; j < borad.length; j++) {
							
							if(borad[j][moves[i]-1] != 0) {
								if(s.isEmpty()) {
									s.add(borad[j][moves[i]-1]);
								}else {
									
									if(s.peek() == borad[j][moves[i]-1]) {
										s.pop();
										answer += 2;
										
									}else {
										s.push(borad[j][moves[i]-1]);
									}
								}
								
								borad[j][moves[i]-1] = 0;
								break;
							}
							
					}
			   }
		   
		   System.out.println("answer --> " + answer);
		   
		   }
		   
	}
