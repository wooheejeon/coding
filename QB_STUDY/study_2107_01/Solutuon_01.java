package study_2107_01;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solutuon_01{
	public static void main(String args[]){
	
//		문제 백준 10818
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		
//      입력 값		
//		5
//		20 10 35 30 7
		
//		출력 값
//		7 35
		
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
	StringTokenizer st = new StringTokenizer(br.readLine()," ");

	int max = -1000001;
	int min = 1000001;

	while(st.hasMoreTokens()) {
		int val = Integer.parseInt(st.nextToken());
		if(val>max) {
			max = val;
		}
		if(val<min) {
			min = val;
		}
	}
	System.out.println(min + " " + max);	
		
	}
}
