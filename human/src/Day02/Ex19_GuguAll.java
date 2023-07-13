package Day02;



public class Ex19_GuguAll {
	// (단)x(1~9)
	// 단에 대한 반복 : 2~9
	// 각 단에 곱 :1~9
	
	
	
	public static void main(String[] args) {
	// A x B
		// i : 단(A)
		for (int i = 2; i <= 9; i++) {
			// j: 곱(B)
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
			}
			// 2*1=2  2*2=4  ...
			System.out.println();     // 한 단 끝 --> 다음줄로
			                          // 이중 반복문 , 중첩 반복문
			     //바깥쪽에있는 반복문의 i가 안쪽에있는 반복문 j의 반복이 끝나야지 다시
			     //j의 반복문 i의 다음반복 3이 적용된다 프린트ln을해놨으니 다음줄에표시됨
		}
        
        
	}

}
