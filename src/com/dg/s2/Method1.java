package com.dg.s2;

import java.util.Scanner;

public class Method1 {
	
	//접근지정자 그외지정자 리턴타입 메서드명(매개변수 선언){}
	//public  static   void  main (String [] args){}
	//접근지정자는 모르거나 확신이 안드면 public
	//그외지정자는 모르거나 확신이 없으면 쓰지 마세요
	//리턴타입은 모르거나 확신이 없으면 void
	//매개변수는 모르거나 확신이 없으면 쓰지 마세요
	
	public void prn() {
		//print, if, for
		
		System.out.println("prn method 실행");
	}
	
	public void prn2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("hello world");
		}
		
	}
	
	public void prn3() {
		System.out.println("hello world");
	}
	
	public void prn4(int num) {
		
		for(int i=0;i<num;i++) {
			System.out.println("Hello World");
		}
		
	}

}
