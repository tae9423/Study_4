package com.dg.s2.ex1;

public class ExMain {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		Handphone handphone = new Handphone();
				
		handphone.make = "Apple";
		handphone.brand = "iphone";
		handphone.color = "deep blue";
		handphone.vol = 13;
		handphone.value = 99;
		
		Handphone handphone2 = new Handphone();
		handphone2.make = "SAMSUNG";
		handphone2.brand = "GALAXY";
		handphone2.color = "Black";
		handphone2.vol = 20;
		handphone2.value = 110;
		
		PhoneView pv = new PhoneView();
		
		Handphone handphone3 = new Handphone();
		
		pv.view(handphone);	
		
		Handphone [] phones = new Handphone[2];
		phones[0]=handphone;
		phones[1]=handphone2;
		
		pv.plus(phones);
		
		
		
		
		
		System.out.println("Ex1 Finish");

	}

}
