package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 10:16:30
 * @subject 문자열을 수정, 삭제, 추가 등등 변경 자주 -> String 클래스 X, StringBuffer, [StringBuilder] 클래스 사용
 * @content 아래 코딩 다 똑같음 
 * 			StringBuffer 클래스의 차이점
 * 			StringBuilder 클래스의 차이점 - 스레드에 안전하다(==동기화 처리가 되어져 있다)
 * 			
 * 			동기화 : A사람(스레드)이 사용할 때 다른 사람(스레드)이 사용하지 못하게 잠금하는 작업을 동기화 처리라고 함 
 * 					공유자원은 꼭 1개여야만 의미가 있음
 * 			예) A 사람(스레드), B 사람(스레드)
 * 
 * 						화장실 1개(공유자원 : 여러 사람이 같이 쓰는)
 * 						A 사람(대변기)
 * 							-> A사람이 들어가서 문을 잠금(lock) : [잠금하는 작업 == 동기화 처리]
 * 							-> A사람이 사용하고 있기 때문에 B사람이 사용 X, 기다려야 함.
 */			
public class Ex01_03 {

	public static void main(String[] args) {
		// 문자열을 수정, 삭제, 추가 등등 변경 자주 -> String 클래스 X, StringBuffer, StringBuilder 클래스 사용
		String str1 ="안녕하세요.홍길동입니다.";
		// toString() 메서드 오버라이딩(재정의) 
		StringBuilder sb = new StringBuilder(str1);
		
		// System.out.println(sb.toString()); // 자신의 정보를 문자열로 반환하는 메서드 앞으로는 아래 코딩으로 사용
		System.out.println(sb);
		
		// 1. 안녕 + (Hello) 삽입 - insert() 메서드
		// System.out.println(sb.reverse()); // reverse() 문자열을 뒤집는 메서드
		int idx = sb.indexOf("안녕") + "안녕".length();
		System.out.println(sb.insert(idx, "(Hello)"));
		
		// 2. 홍길동 삭제  - delete() 메서드
		int start = sb.indexOf("홍길동");
		int end = start + "홍길동".length();
		System.out.println(sb.delete(start, end));
		
		// 3. 홍길동 -> 야리니 수정 - replace() 메서드 > String 클래스에 있는 메서드와 매개변수가 다름
		sb.replace(start, end, "야리니");
				
	} // main

} // class