package com.dg.s4;

public class Car {
	
	static String company = "Kia";
	String brand;
	String color;
	int price;
	int gitong;
	
	//생성자
	public Car() {
		this("Black");
		
	}
	
	public Car(String color) {
		this(color, 6000);
		System.out.println("success");
		
	}
	
	public Car(String color, int price) {
		
		
		this.brand = "재네시스 g70";
		this.color =color;
		this.price =price;
		this.gitong = 8;	
	}
	
	public void info() {
		System.out.println("Company : "+Car.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price);
		System.out.println("Gitong : "+this.gitong);
		System.out.println("=========================");
	}

}
