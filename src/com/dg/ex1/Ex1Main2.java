package com.dg.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("Main2 Start");
		Scanner sc = new Scanner(System.in);
		Pet [] pets = new Pet[2];
		Pet pet = null;
		
		for(int i=0;i<2;i++) {
		System.out.println("펫 이름을 입력해주세요");
		pet.name = sc.next();
		pets[i]= pet;
		}
			
		Character c1 = new Character();
		
		for(int i=0;i<2;i++) {
			
			System.out.println(pets[i].name);			
		}
		
		
		
		
		System.out.println("Main2 Finish");

	}

}
