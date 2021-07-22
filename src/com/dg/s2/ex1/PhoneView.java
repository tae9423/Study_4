package com.dg.s2.ex1;

import java.util.Scanner;

public class PhoneView {
	
	public void view(Handphone handphone) {
				
		System.out.println(handphone.brand);
		System.out.println(handphone.brand);
		System.out.println(handphone.color);
		System.out.println(handphone.vol);
		System.out.println(handphone.value);
		
		
	}
	
	public void plus(Handphone [] phones) {
		
		int sum=0;
		
		for(int i=0;i<phones.length;i++) {
			sum = sum+phones[i].value;
			
		}
		System.out.println("최종 가격 : " +sum);
		
	}
}
