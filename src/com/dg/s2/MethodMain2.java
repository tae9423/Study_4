package com.dg.s2;

import java.util.Random;

public class MethodMain2 {

	public static void main(String[] args) {
		Method2 m2 = new Method2();
		
		m2.t1(); // void
		String name = m2.t2();
		System.out.println(name);
		int [] ar =m2.t4();
		for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
		}

		Random random = new Random();
		int r = random.nextInt();
		System.out.println(r);
		
	}

}
