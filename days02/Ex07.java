package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 2:11:09
 * @subject 콤마 연산자 설명
 * @content 동일한 자료형의 변수를 여러 개 선언할 때 > 콤마 연산자 사용
 */
public class Ex07 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		// 연산자에 따라 처리되는 방향이 있다.
		// 왼 -----> 오
		// 2 + 3 + 5
		
		// 왼 <----- 오
		a = b = c = 100;
		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
		
	}
	
	/*
	public static void main(String[] args) {
		// 두 정수를 선언하고 각각 10, 20 값으로 초기화를 하여
		// 두 정수의 합을 출력하세요.
		// 조건) 출력 형식 : 10 + 20 = 30
		
		/*
		int a = 10;
		int b = 20;
		int c = a + b;
		* /
		
		// , 콤마 나열 연산자
		int a = 10 , b = 20, c = a + b;
		
		System.out.printf("%d + %d = %d", a, b, c);

	}
*/	

}
