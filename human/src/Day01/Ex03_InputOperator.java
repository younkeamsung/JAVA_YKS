package Day01;

import java.util.Scanner;

public class Ex03_InputOperator {
	//main : ctrl + space
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("Z : ");
		int z = sc.nextInt();
		
		// 합계,평균
		int sum = x + y + z;
		double avg = (double) sum / 3;
		// 강제 형변환  위에건 인트인 sum을 강제로 더블로 바꾼뒤 더블이랑 인트랑 연산해서 자동으로 더블로바뀜.
		// (큰 자료형) + (작은 자료형) = (쿤 자료형)
		// - 서로 다른 자료형을 연산 시, 결과는 큰 자료형으로 반환된다.
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg int(정수)형 변수라서 소수부분을 표현할 수 없다!!!<<<
		// 평균을 소수점까지 표현하려면 실수형 변수를 사용한다.
		sc.close();
	}

}
