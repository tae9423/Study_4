package com.dg.s2.ex2;

import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		System.out.println("Ex2 Start");
				
		Scanner sc = new Scanner(System.in);
		
		StudentController menu = new StudentController();
		
		menu.start();
		
		
		
		
		System.out.println("Ex2 Finish");
	}

}
