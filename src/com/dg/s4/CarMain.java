package com.dg.s4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();		
		
		
		Car car2 = new Car("White");
		
		Car car3 = new Car("Blue", 5000);
		
		Scanner sc = new Scanner(System.in);
		
		Car.company = "BMW";
		
		car.info();
		car2.info();
		car3.info();

	}

}
