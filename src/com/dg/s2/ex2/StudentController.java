package com.dg.s2.ex2;

import java.util.Scanner;





public class StudentController {
	
	//메서드명 start
	
	public void start() {
		System.out.println("학생 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		StudentView sv = new StudentView();
		StudentInput si = new StudentInput();
		StudentSort ss = new StudentSort();
		
		int count = sc.nextInt();
		
		//학생을 모을 배열 선언
		Student [] students = new Student[count];
			
		
		for(int i=0;i<students.length;i++) {
			
			//Student student = si.makeStudent();
			//students[i]=student;
			students[i]= si.makeStudent();
			
		}
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("1. 전체 정보 출력 2. 학생 번호 검색 3. 학생 정보 추가 4. 성적 순서 출력 5. 프로그램 종료");
			System.out.println("번호를 눌러주세요");
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("전체 정보 출력입니다.");				
				sv.viewAll(students);
				break;
				
			case 2:
				System.out.println("학생 번호 검색입니다.");				
				System.out.println("검색할 학생의 번호를 입력해주세요");
				int num = sc.nextInt();
				
				Student student = null;
				for(int i=0;i<students.length;i++) {
					if(students[i].num==num) {
						student = students[i];
						break;
					}
				}
				if(student != null) {
					sv.viewOne(student);
				}
				break;
				
			case 3:
				System.out.println("학생 정보 추가입니다.");
				Student st=si.makeStudent();				
				students = si.addArray(students);				
				students[students.length-1]=st;
				break;
			
			case 4:
				System.out.println("성적 순서 출력입니다.");
				Student [] sort= ss.sortByAvg(students);
				sv.viewAll(sort);				
				break;
			
			case 5:
				System.out.println("");
				flag = !flag;
			}
		}
		
	}

}
