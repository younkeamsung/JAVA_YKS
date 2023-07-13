package Day02;

public class Ex14_WhileSum {
	
	public static void main(String[] args) {
		//1부터 100까지의 합계
		//sum의 기본값
		int sum = 0; 
		int a = 1;
		while ( a <= 100) {
			sum += a++; //sum = sum + a;
			//a = a + 1;
			System.out.println("합계 : " + sum);
			// sum = sum + a
			// 1      0    1
		}
	}

}
