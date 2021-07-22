package com.dg.s1;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		System.out.println("Study2 Start");
		
		System.out.println("학생 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		//학생을 모을 배열 선언
		Student [] students = new Student[count];
		
		Student student = null;
		Student sts = null;
		
		
		//학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		//총점 평균
		
		
		for(int i=0;i<students.length;i++) {
			student = new Student();
						
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
			students[i]= student;
			
		}
		
		//1. 전체정보 출력  2. 학생 번호 검색 3. 학생 정보 추가 4. 성적 순서 출력 5. 종료
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 전체정보 출력\t2. 학생 번호 검색\t3. 학생 정보 추가\t4. 성적 순서 출력\t5. 종료");
			System.out.println("번호를 입력하세요");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
				System.out.println("=====================================================");
				for(int i=0;i<students.length;i++) {	
						
				System.out.print(students[i].name+"\t");
				System.out.print(students[i].num+"\t");
				System.out.print(students[i].kor+"\t");
				System.out.print(students[i].eng+"\t");
				System.out.print(students[i].math+"\t");
				System.out.print(students[i].total+"\t");
				System.out.println(students[i].avg);
				System.out.println("-----------------------------------------------------");
				
				}	
				
				break;
				
			
			case 2:
				System.out.println("검색할 학생의 번호를 입력해주세요");
				int num = sc.nextInt();
				for(int i=0;i<students.length;i++) {
					if(students[i].num==num) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
						System.out.println("=====================================================");
						System.out.print(students[i].name+"\t");
						System.out.print(students[i].num+"\t");
						System.out.print(students[i].kor+"\t");
						System.out.print(students[i].eng+"\t");
						System.out.print(students[i].math+"\t");
						System.out.print(students[i].total+"\t");
						System.out.println(students[i].avg);
					}
				}
				break;
				
			case 3:
				Student [] students2 = new Student[students.length+1];
				
				System.out.println("추가할 학생의 이름을 입력해주세요");
				sts = new Student();
				sts.name = sc.next();
				
				System.out.println("추가할 학생의 번호를 입력해주세요");
				sts.num = sc.nextInt();
				
				System.out.println("추가할 학생의 국어 점수를 입력해주세요");
				sts.kor = sc.nextInt();
				
				System.out.println("추가할 학생의 영어 점수를 입력해주세요");
				sts.eng = sc.nextInt();
				
				System.out.println("추가할 학생의 수학 점수를 입력해주세요");
				sts.math= sc.nextInt();
				
				sts.total = sts.kor + sts.eng + sts.math;
				sts.avg = sts.total / 3.0;				
				
				
				for(int i=0;i<students.length;i++) {
					students2[i]=students[i];							
				}	
					students2[students.length]=sts;
					students = students2;				
				break;
				
			case 4 :
				System.out.println("성적 순서");
				
				for(int idx=0; idx<students.length-1; idx++) {
					for(int i=idx+1;i<students.length;i++) {
						if(students[idx].total<students[i].total) {
							int tmp = students[i].total;
							students[i].total = students[idx].total;
							students[idx].total = tmp;	
							
							//이름 자리 바꾸기
							String t = students[i].name;
							students[i].name = students[idx].name;
							students[idx].name=t;
							
							//번호 자리 바꾸기
							int t2 = students[i].num;
							students[i].num = students[idx].num;
							students[idx].num=t2;
							
							//국어 점수 자리 바꾸기
							int t3 = students[i].kor;
							students[i].kor = students[idx].kor;
							students[idx].kor=t3;
							
							//영어 점수 자리 바꾸기
							int t4 = students[i].eng;
							students[i].eng = students[idx].eng;
							students[idx].eng=t4;
							
							//수학 점수 자리 바꾸기
							int t5 = students[i].math;
							students[i].math = students[idx].math;
							students[idx].math=t5;
							
							//평균 점수 자리 바꾸기
							double t6 = students[i].avg;
							students[i].avg = students[idx].avg;
							students[idx].avg=t6;
				
						}
			}
		}
				
				for(int i=0;i<students.length;i++) {
					
					System.out.print(students[i].name+"\t");
					System.out.print(students[i].num+"\t");
					System.out.print(students[i].kor+"\t");
					System.out.print(students[i].eng+"\t");
					System.out.print(students[i].math+"\t");
					System.out.print(students[i].total+"\t");
					System.out.println(students[i].avg);
					System.out.println("-----------------------------------------------------");
				}
				break;
				
			case 5:
				System.out.println("종료하겠습니다.");
				flag=!flag;
			}
		
		
		
	}
		System.out.println("Study2 Finish");
}
}
		


