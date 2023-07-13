package Day05;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// (입력 예시)
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
		// (출력 예시)
		// 1 2 3
		// 4 5 6
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		
		// 배열 생성
		int arr[][] = new int[M][N];
		
		// 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}	
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
		// 위아 같이, X행Y열 2차원 배열을 생성하고,
		// 순서대로 값을 입력받아 그대로 출력해보세요
		// (단, 출력 시 foreach 문을 사용)
		System.out.print("X : ");
		int X = sc.nextInt();
		System.out.print("Y : ");
		int Y = sc.nextInt();
		
		int arr2[][] = new int[X][Y];
	
        // 입력
	    for (int i = 0; i < arr2.length; i++) {
	    	for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}			
	    
	    // 출력
	    //foreach
	    // arr2 에있는 1차원배열을 row라는 이름으로 가져온다음 row에있는 모든값을 col이라는 이름으로사용 후출력
	    // arr2 는 2차원 배열이기때문에 또다른 1차원배열을 다시반복
	    for (int[] row : arr2) {
	    	for (int col : row) {
	    		System.out.print(col + " ");
			}
	    	System.out.println();
			
		}
	    sc.close();
	    
			}
			

		
	}
	
