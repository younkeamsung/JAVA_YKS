package Day04.Ex01_Student;


public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 변수
    String name;
    int age;
    String stdNo;
    String major;
	
	// 생성자
	// - 기본 생성자
    public Student() {
    	this("이름없음", 1, "00000000", "없음");
    }
    // - 모든 매개변수를 포함하는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
    	
	
	// 메소드
	// - 공부하기
    // 접근지정자 반환타입 (static) 메소드명( 매개변수 ) { }
	// * void : 반환타입 없음을 지정하는 키워드
	public void study( String subject ) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// 반환타입 void 면, return 을 생략해도 된다.
	}
	
	// - 성적 평균 구하기	
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		average = (double) (score1 + score2) / 2;
		return average;
	}
	
	// 메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}
	
	public double getAverage( int[] scores ) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		// 평균을 구해보시오.
		int sum = 0;
		for (int i : scores) {
			sum += i;  
		}   // 아래에있는 for문을 위에있는 foreach 문으로 줄인것
		//for (int i = 0; i < scores.length; i++) {
		     //sum += scores[i];
		// sum 나누기 스코어의 개수
		//}
		
		average = (double) sum / scores.length;
		
		
		
		

		return average;
	}
	
	
}	
	

