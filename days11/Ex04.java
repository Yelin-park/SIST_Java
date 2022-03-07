package days11;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 3:01:36
 * @subject Chapter5 배열 p182
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 1. 배열의 정의? 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 * 				   동일한 자료형이 메모리 상에 연속적으로 놓이게 한 것
		 * 
		 * 2. 배열 선언 형식
		 *    자료형[] 배열명; // 배열명을 변수, 참조변수(주소 값을 참조하기때문에)이라고 한다. 
		 *    자료형 배열명[];
		 *    
		 * 3. 배열 생성 형식 - new 연산자를 사용해서 힙(동적)영역에 실제 기억공간이 할당되고 그 시작 주소를 배열명이 참조한다.
		 * 	  배열명 = new 자료형[배열크기];
		 * 
		 * 4. 예) []인덱스(index) 연산자를 설명 - 배열
		 * 		  1000명의 국어점수를 저장할 변수를 선언
		 * 		  int[] kors   -> 스택영역에 생성
		 * 		  kors = "new int[1000]" -> new를 통해 힙(동적)영역에 있는 주소를 kors가 참조 
		 * 
		 * 5. 배열의 요소
		 * 		첨자값 == index(인덱스)
		 *      0번째 요소      배열명[0]
		 *      1번째 요소
		 *      2번째 요소
		 *      
		 *      999번째 요소    배열명[999] == 배열명[배열명.length-1]
		 * 
		 * 6. 배열크기 == 배열명.length
		 * 
		 * 7. 배열의 길이 변경 p189   Ex04_02.java
		 * 
		 * 8. 배열의 초기화   p189
		 * 
		 * 9. 배열을 초기화하지 않으면 각 자료형의 기본값으로 초기화가 되어져 있다.
		 * 	  ex) int[] m = new int[3];
		 * 		  int의 기본값인 0으로 초기화 되어져 있다.
		 *        m[0] = 0;
		 *        m[1] = 0;
		 *        m[2] = 0;
		 * 
		 *    
		 *    
		 *    
		 */

	}

}