package Day06.Ex01_ObjectArray;

/*
    반지름이 1~5인 Circle 객체 5개를 가지는 배열을 생성하고,
    배열요소에 있는 모든 Circle 객체의 넓이를 출력하시오.
  
 */

class Circle{
	// 변수  :반지름
	// 메소드 : 넓이
	int radius;
	
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 메소드
	public double getArea() {
		// (원의넓이) = (원주율) * (반지름)^2
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	
	public static void main(String[] args) {
		// Circle 객체 배열 c 선언
		// 5개의 배열요소 생성
		Circle[] c;           // Circle 객체 배열 c 선언
		c = new Circle[5];    // 5개의 배열요소 생성
		
		// 반지름 1~5인 Circle 객체 생성 후, 배열에 대입
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i+1);
		}
		// 출력
		for (Circle circle : c) {
			System.out.println("넓이 : " + circle.getArea());
		}
		
	}
	

}
