package Day02;

import java.util.Scanner;

public class Ex21_Star2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
        	for (int j = 1; j <= N -i +1; j++) {
        		System.out.print("*");
				//N을입력받아 N의 숫자부터 떨어지는삼각형
			}
        	System.out.println();
        }for (int i = 1; i <= N; i++) {
            	for (int j = N; j >= i; j--) {
            		System.out.print("*");
		}
        System.out.println();
	}sc.close();

	}
	
}
