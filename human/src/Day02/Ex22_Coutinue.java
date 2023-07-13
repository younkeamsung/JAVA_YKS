package Day02;

import java.util.Scanner;

public class Ex22_Coutinue {
	
	public static void main(String[] args) {
		//5개의 정수를 입력받아,
		//입력받은수 중 양수(+)만 합계를 구하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("양수의 합만 :");
		int sum = 0;     //합계
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			
			// 음수일 때만, 합계에 누적하지 않고 넘어가려면?
			if(n < 0 )
				continue;
			
			// 합계를 구하는 수식
			sum += n;     //sum = sum + n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}

}
