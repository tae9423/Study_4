package com.dg.s3;

public class Test1 {
	
	//멤버변수
	int num;
	int num2;
	
	
	//멤버메서드
	public void info() {
		//메서드 내에서 다른 메서드 호출 가능??
		info2();
		
		System.out.println("Info Method 실행");
		System.out.println(num+num2);
	}
	
	public void info2() {
		System.out.println(num*num2);
		System.out.println("This : "+this);
	}
	
	public void info3(int num) {
		System.out.println(this.num-num);
	}

}
