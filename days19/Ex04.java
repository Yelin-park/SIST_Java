package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 10:38:36
 * @subject p400 디폴트 메서드와 static 메서드
 * @content 사용할 일은 거의 없을 거 같으나 개념 파악하기
 */
public class Ex04 {

	public static void main(String[] args) {
		// JDK 1.8부터
		// 아래 두가지 메서드의 접근제어자는 public
		// 1. default 메서드
		// 설명 : 인터페이스에 새로운 메서드를 추가하면 그 인터페이스로 구현된 모든 클래스들이 에러가 뜨게된다.
		// 		  에러발생 이유? 새롭게 추가한 메서드를 오버라이딩(재정의)하지 않아서 -> 재정의 하지 않으면 추상클래스가 되어버림
		//		  이와 같은 문제를 해결하기 위해서 디폴트 메서드를 가질 수 있게 되었고,
		//        인터페이스에 디폴트 메서드를 추가하면 새롭게 추가한 메서드를 사용할 클래스에서만 오버라이딩(재정의)해서 사용하면 된다.
		// 			[충돌 해결 규칙] -> 그냥 필요한 쪽의 메서드와 같은 내용으로 오버라이딩 하면 그만~
		//				1) 여러 인터페이스의 디폴트 메서드 간의 충돌 -> 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩
		//				2) 디폴트 메서드와 조상 클래스의 메서드 간의 충돌 -> 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.
		
		// 2. static 메서드
		// 설명 : 모든 메서드는 추상메서드여야 한다는 이유로 인터페이스와 관련된 static메서드는 별도의 클래스에 따로 두어야 했음
		//			-> 별도의 클래스를 두지 않고 인터페이스 안에 static 메서드를 가질 수 있게 되어 불필요한 클래스를 가지지 않을 수 있음
		// 
	} // main

} // class
