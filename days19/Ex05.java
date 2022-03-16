package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 11:00:40
 * @subject p403 내부 클래스(inner class) - 개념 잡기
 * @content 수업 끝나고 p405 ~ p409 정독 + 코딩하기
 * 			익명(anonymous) 클래스 사용 많이 함 *****
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 1. 내부 클래스(inner class)는 주로 GUI 어플리케이션의 이벤트 처리 사용
		 * 									  GUI(윈도우용) 어플리케이션 만들 때는 AWT, Swing 사용(이유 : 자바는 시간이 더 오래걸림)
		 * 										<메모장 만드는데 걸리는 시간>
		 * 										 C#, Visual Basic 언어 4시간
		 * 										 Java 일주일
		 *  
		 * 2. 사용 빈도가 낮다.
		 * 
		 * 3. 클래스 내부(안)에 클래스를 멤버처럼 선언 == 클래스 안에 클래스를 선언한 것을 내부 클래스
		 * 
		 * 4. 클래스 + 긴밀한 관계 + 클래스(두 클래스가 서로 긴밀한 관계)
		 * 
		 * 5. 장점 2가지
		 * 		1) 접근성 - 클래스 멤버와 내부 클래스 서로 호출이 쉬움(내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있음)
		 * 		2) 보안성 + 캡슐화(코드의 복잡성을 줄일 수 있음)
		 * 			class A{ // 외부 클래스
		 * 			 // 필드
		 * 			 int x;
		 * 			 static int y; 	  // static 멤버처럼 사용 되어진다.
		 * 			 B obj = new B(); // 외부 클래스의 인스턴스 멤버처럼 사용(멤버변수)
		 * 
		 * 			 // 내부 클래스 - 외부 클래스 필드처럼 선언되어짐
		 * 			 private class B{
		 * 				// 외부 클래스의 필드 접근
		 * 				// 외부 클래스의 메서드 접근
		 * 			 }
		 * 			}
		 * 
		 * 6. 내부 클래스의 종류 및 특징 - 변수의 선언위치에 따라서 나눈다
		 * 	1) 인스턴스 클래스 - 외부 클래스의 필드(멤버변수) 선언 위치, 외부 클래스의 인스턴스 멤버 처럼 사용 되어짐
		 * 	2) static 클래스 - 	외부 클래스의 필드(멤버변수) 선언 위치, 외부 클래스의 static 멤버 처럼 사용 되어짐
		 * 	3) 지역(local) 클래스 -  메서드 안, 초기화 블럭 안에 선언 및 사용 됨
		 * 	***** 4) 익명(anonymous) 클래스 - 클래스 선언+생성(선언과 생성 동시에), 클래스 이름이 없음, 일회성 클래스(인스턴스 한 번 생성 후 사용X) *****
		 * 
		 * 			
		 */

	} // main

} // class