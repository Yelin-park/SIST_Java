package days14;

/**
 * @author Yelin
 * @date 2022. 3. 8. - 오후 3:26:10
 * @subject Chapter6 객체지향프로그래밍 p230
 * @content			 Object Oriented Programming == OOP
 * 
 * 		// ***** 객체지향 파트 부터는 개념을 이해하고 암기 *****
		// 오버로딩 개념 설명
		// 1. 같은 메서드 명으로 여러 개 중복 선언
		// 2. 메서드명 동일, 매개변수의 타입 또는 갯수가 다른 여러 개 중복 선언
		// 3. 오버로딩 == 중복함수
		// 4. overloading == overload
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		/* - 절차적 프로그래밍 -> 구조적 프로그래밍 -> 객체지향적 프로그래밍
		 * - 구조적 프로그래밍? 함수가 기본이 되는 프로그래밍 방식(기법), 객체지향적 나오기 전에 나왔던 방식
		 * 
		 * 1. 객체 지향적 프로그래밍? [프로그래밍 : 코딩, 개발한다.] -> 언어 : 객체지향적프로그래밍언어(Java, C# 등등 요즘 언어들)
		 *  - 개발 하는 기법 중 하나
		 *  - 객체를 지향하는(객체 지향적) 방식으로 개발한다(프로그래밍한다)
		 *  - 즉, 프로그램을 개발하는 기법 중 하나로 객체를 지향하여 개발하겠다.
		 *  - 객체 단위(용도에 따라 나눠진 것)로 프로그래밍하는 기법(방식)
		 *  - 객체 단위로 프로그래밍을 하면 유지보수용이, 분업화를 하기 때문에 팀작업이 가능하여 생산성이 좋음
		 *  
		 *  ex) 컴퓨터 조립                                    ==                           애플리케이션
		 *      경제적 여유 / 사용 용도에 따라서
		 *      아래의 부품들이 결정됨
		 *      
		 *      메모리	   메모리 고장 > 수리 / 새롭게 장착	> 유지보수용이						Object - 유지,보수 용이
		 *      전원장치																	    Object
		 *      메인보드																		Object
		 *      CPU																				Object
		 *      그래픽카드																		Object(개발 직접 구현)
		 *      운영체제																   		Object(라이브러리 구매)
		 *      SSD/HDD		2테라 확장															Object - 확장
		 *      ODD																				Object
		 *      등등
		 *      
		 *      각각 조립 부품(객체, 개체, Object)들을 구매
		 *      
		 *      부품들이 오면 컴퓨터 조립
		 *      컴퓨터조립 = Object + Object + Object + .... + Object(SSD,HDD)
		 *      애플리케이션 = Object + Object + Object + .... + Object(확장)
		 *      
		 * 2. 객체와 클래스
		 * 	 - 객체(Object), 개체, 물건(조립부품) ? 클래스(설계도)를 가지고 만들어져 실제로 존재(생성된)하는 것 > 사물(유형) 또는 개념(무형)의 객체
		 *   - 클래스 ? 객체를 만들기 위한 설계도(객체의 설계도)
		 *   - 인스턴스화 ? 클래스(설계도)를 가지고 객체를 만드는 과정
		 *   ex) 집을 짓기 위한 설계도(클래스) =>     건축(인스턴스화)   =>    땅 위에 지은 집(객체) == "인스턴스"라고 부른다
		 *   
		 * 3. OOP의 특징 == 클래스의 특징 == Object+Object+Object+Object+Object+...(객체들이 모여서 하나의 프로그램을 만들겠다)
		 *   1) 상속성      
		 *   2) 다형성
		 * 	 3) 추상화
		 *   4) 캡슐화
		 *   5) 은닉화
		 *   
		 * 4. 객체의 구성 요소 = 객체가 하는 기능(일) + 객체가 가지고 있는 속성(특성)  == 속성과 기능
		 *   ㄱ. 객체의 구성 요소를 "멤버"라고 부른다.
		 *   ㄴ. 속성(property) == 멤버변수 == 필드(field) == 특성(attribute) == 상태
		 *   ㄷ. 기능(function) == 멤버함수 == 메서드(method)
		 *   
		 *    클래스 ? 집(객체)을 지으려고 설계도면(클래스)
		 *    건출설계사가 만든 설계도(=클래스) == 객체를 만들기 위한 설계도
		 * 5. 클래스(설계도면) 설계하는 과정 
		 *   1) 객체의 구성 요소(속성, 기능) 파악 -> 목록 작성
		 *   2) 클래스 선언(설계도면 생성)
		 *   	[접근지정자] [기타제어자] class 클래스명 [extends 수퍼클래스] [implements 인터페이스...]{
		 *   		// [클래스의 멤버를 선언]
		 *   		// 기능(메서드) 선언
		 *   		// 속성(필드,변수) 선언
		 *    }
		 *   3) 객체 생성 - 테스트
		 *   4) 테스트 후 문제점 파악 -> 유지, 보수
		 *   5) 상용화
		 *   6) 보완해야할 문제점 발생 + 멤버(기능, 속성) 추가(확장) -> 버전 관리
		 * 
		 * 6. 기본형 - 8가지(byte, short, int, long, float, double / char / boolean)
		 *    참조형 - 클래스, 배열, 인터페이스
		 *    			new 연산자에 의해서 실제 기억공간의 힙(동적영역)에 할당되고 스택영역에서 주소를 참조한다.
		 *    			
		 *    			힙
		 *    			[][][][]				[시작주소]
		 *    			시작주소				m 변수 == 참조변수 == 배열명
		 *    
		 *    			Random rnd = new Random();
		 *    			클래스(Random)를 자료형으로 선언된 변수(rnd)를 참조변수, 객체라고 한다.
		 * 
		 * 7. 자동차(객체)를 만들기 위한 설계도 == 클래스
		 *   1) 객체의 구성 요소(속성, 기능) 파악 -> 목록 작성
		 *   	스포츠카
		 *   	0 ~ 100km 3초(제로백)
		 *   	전기차
		 *   	2도어
		 *      가로*세로
		 *      알루미늄 재질
		 *      등등
		 *      
		 *   2) 클래스 선언 : Car 클래스 선언
		 *   3) 객체 생성 - 테스트   
		 */
		
		// - 객체 생성하는 형식
		// 	 new 클래스명();  > new Car();
		// - 객체 선언하는 형식
		//   클래스명 변수명  > Car myCar
		
		// [객체 선언 및 생성 형식]
		// 클래스명 변수명 = new 클래스명(); -> 인스턴스화
		Car myCar = new Car();
		// myCar == 변수명 / 참조변수 / 객체
		// new Car(); == 실제 힙 영역에 생성되어져 있는 객체(인스턴스) == 인스턴스 생성
		// new Car();를 통해 객체를 생성하여 myCar라는 변수에 담아 Heap(동적 메모리)에 할당되었다. -> 인스턴스생성
		// 객체를 통해서 인스턴스를 참조
		
	
		// [멤버 접근할 때 .(점) 멤버연산자 사용]
		// 객체명.필드
		// 객체명.메서드()
		myCar.name = "스포츠카-2";
		myCar.speed = 200;
		// System.out.println(myCar.name);
		
		// 출력 기능(메서드 == 멤버함수)
		myCar.dispCarInfo();
		
		

	} // main

} // class

/*
 * 1. OOP 설명
 * 2. Object 설명
 * 3. Instance 설명
 * 4. Class 설명
 * 5. 객체/클래스/인스턴스 구분해서 설명
 * 	// 클래스와 객체와 인스턴스의 차이점(구분)
*/