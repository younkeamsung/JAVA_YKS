package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		switch ( num % 5) {
		case 0: 
		
		case 1:System.out.println("*");
		break;
//		case 2:
//		case 3:
//		case 4:System.out.println("**"); break;
//케이스0이걸렸는데출력값이없는경우브레이크가있는케이스까지내려가서출력함		
	
		default:System.out.println("**");
			break;
		}
		
		// 입력받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch
		
		
		sc.close();
	}

}
