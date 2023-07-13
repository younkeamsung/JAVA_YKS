package Day06.Ex01_ObjectArray;

import java.util.Scanner;

/*
    책제목, 저자명을 갖는 Book 이라는 클래스를 정의하고,
    Book 클래스타입의 객체 배열을 생성하여
    사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
 */

class Book{
	String title, author;      // 책제목, 저자명
	
	// 생성자
	public Book() {
        this("제목없음", "작자미상");		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// Book [rirle="이것이자바다", author="신용권"]
		// 객체를 출력할 때, "패키지.클래스@해시코드" 대신 출력할 문자열 형식을 지정하는 메소드
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	
}


public class BookArray {

	public static void main(String[] args) {
		// Book 타입의 객체 배열 선언 및 생성
		Book[] bookArray = new Book[3]; 
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			// Book 객체를 생성하여, bookArray 배열요소에 대입
			bookArray[i] = new Book( title, author );
		}
		
		// 출력
		for (Book book : bookArray) {
		    System.out.println( book );	
		}
		
		sc.close();
	}
	
}
