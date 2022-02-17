package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 3:52:17
 * @subject 정수 계열 : byte, short, int, long > 1, 2, 4, 8
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		// 크기    + 저장 형식 => 정수 계열 자료형
		// 1/2/4/8     정수
		
		// 예) 나이를 저장할 age 변수 선언하세요
		// 1. 기본형 - 숫자 - 정수
		// byte1   [][][][][][][][] > 8bit > 2^8=256가지 부호가 1bit라서([] 1개 빠짐) 2^7=128가지 즉, 양수/음수 128가지
		//                                   표현범위 -128 ~ 127
		
		// short2  [][][][][][][][] [][][][][][][][] > 2^16이지만 부호가 1bit라서 2^15=32,768가지 즉, 양수/음수 32,768가지 
		//                                             표현범위 -32,768 ~ 32,767
		
		// int4    [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		// 2^32이지만 부호 1bit 빠지면 2^31 즉, 양수 2,147,483,648가지 음수 2,147,483,648가지
		// 표현범위 -2,147,483,648 ~ 2,147,483,647 > -21억 ~ 21억
		
		// long8   [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] 
		// 2^64이지만 부호 1bit 빠지면 2^63 즉, 양수/음수 9,223,372,036,854,775,808가지
		// 표현범위 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 > -900경 ~ 900경
		
		// 1bit 표현할 수 있는 정수값 : 0/1 > 2가지
		// 2bit 표현할 수 있는 정수값 : 00 01 10 11 > 4가지 2^2=4
		//                               1  2  3  4
		
		// 가정 : 나이 최저 1살 ~ 최고 125살 > byte로 표현 가능
		// long age; 메모리 7바이트 낭비 / 처리 속도 8배 떨어진다.
		byte age;
		age = 20;
		
		// 문제 예) 한 학생의 국어 점수를 저장할 kor 변수를 선언하세요.
		// 1. 자료 형식(종류) : 숫자
		// 2. 국어점수 범위 : 0 ~ 100
		byte kor;
		kor = 95;
		
		// 정수 출력 서식 : byte, short, int, long > %d
		System.out.printf("age=%d, kor=%d\n", age, kor);
		
		
		
	} // main

} // class