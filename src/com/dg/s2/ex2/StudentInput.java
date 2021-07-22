package com.dg.s2.ex2;

import java.util.Scanner;

public class StudentInput {
	
	
	
	public Student[] addArray(Student [] old) {
		
		Student [] students = new Student[old.length+1];
		
		for(int i=0;i<old.length;i++) {
			students[i]=old[i];		
			
		}	
				return students;	
	}
		
	public Student makeStudent() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);				
					
		System.out.println("이름을 입력하세요");
		student.name = sc.next();
		
		System.out.println("번호를 입력하세요");
		student.num = sc.nextInt();
		
		System.out.println("국어 점수를 입력하세요");
		student.kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		student.eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		student.math = sc.nextInt();					
		
		student.total = student.kor + student.eng + student.math;
		
		student.avg = student.total / 3.0;
		
		return student;
	}

}
