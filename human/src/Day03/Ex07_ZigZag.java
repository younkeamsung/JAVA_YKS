package Day03;



import java.util.Scanner;

public class Ex07_ZigZag {
	
	public static void main(String[] args) {
		// 배열의 크기 N을 입력 받아,
		// NxN 구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입하는데,
		// 1행부터는 왼쪽에서 오른쪽 순서로 값을 대입하고
		// 행이 바뀔 때마다 순서를 반대로 (리버스)대입하는 2차원 배열을 만들고 출력하기
		// (입력예시)
		// 4
		// (출력예시)
		// 1 2 3 4
		// 8 7 6 5
		// 9 10 11 12
		// 16 15 14 13
		
		// 1. N을 입력받는다
		// 2. NxN 구조의 배열을 생성한다
		// 3. 초기값이 1인 변수 k 를 선언
		// 4. 배열을 반복하여,
		//   i) 정방향으로 값을 대입
		//  ii) 역방향으로 값을 대입
		// 5. 배열을반복하여 출력한다
		
		// 1. N을 입력받는다
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 2. NxN 구조의 배열을 생성한다
		int arr[][] = new int [N][N];
		// 3. 초기값이 1인 변수 k를 선언한다
		int k = 1;
		int sw = 1;
		
		// 4. 배열을 반복하여,
		// 바깥쪽 반복문 : i - 행
		for (int i = 0; i < arr.length; i++) {
			// 안쪽 반복문 : j - 열
			
			if ( sw == 1) {
			// i) 정방향으로 값을 대입
			for (int j = 0; j < N; j += sw) {
			arr[i][j] = k++;
			}
			// sw = -1;
			}
			
			
				// ii) 역방향으로 값을 대입
			else {    
			for (int j = N-1; j >= 0 ; j += sw) {
				arr[i][j] = k++;
					// N이 5라고 쳤을때 인덱스로는 최대값이 4이니 N-1을하면인덱스번호 5-1= 4로시작해서
			    	// j-- 로 점점 줄어들게 만든다 j >= 0 <<0보다 크거나 같을때까지
				}    
			// sw = 1;
				}
		// 방향 전환
		sw = sw * (-1);
				}
		// 5. 배열을 반복하여 출력한다
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			
	sc.close();
	
		}
		
		
	}

	


