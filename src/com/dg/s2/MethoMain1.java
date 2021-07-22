package com.dg.s2;

import java.util.Scanner;

public class MethoMain1 {

	public static void main(String[] args) {
		System.out.println("Method1 Start");
		
		
		Method1 mth1 = new Method1();
		
		//참조변수명.메서드명();
		//메서드를 
		mth1.prn();
		
		
		//mth1.prn2();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		int count = sc.nextInt();
		
		/*
		 * for(int i=0;i<num;i++) { mth1.prn3(); }
		 */
		mth1.prn4(count);
		
		System.out.println("Method1 Finish");
	}

}
