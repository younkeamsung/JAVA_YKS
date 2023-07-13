package Day04.Ex01_Student;

public class StudentEx {
	
	public static void main(String[] args) {
		//Student 객체 생성
		Student student = new Student();
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "20240001";
		student.major = "컴퓨터공학과";
		
		//Student2 객체 생성
		Student student2 = new Student("정종문", 20, "20140002", "실용음악과");
	
		int[] score = {10,20,30,40,50};    //학생1의 성적
		int[] score2 = {100,100,100,90,95};//학생2의 성적
		
		
		System.out.println("#### 학생1 ####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - Java 공부하기");
		student.study("Java");
		
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20));
		System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(30, 40, 50));
		System.out.println("학생1 - 최종 점수 : " + student.getAverage( score ));
		
		
		System.out.println("#### 학생2 ####");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		System.out.println("학생2 - 전공실기 공부하기");
		student2.study("전공실기");
		
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100, 100));
		System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100, 90, 95));
		System.out.println("학생2 - 최종 점수 : " + student2.getAverage( score2 ));
	}

}
