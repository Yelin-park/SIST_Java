package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오전 10:32:14
 * @subject
 * @content 1. 질문 풀이
 */
public class Ex02 {

	public static void main(String[] args) {
		// 1. 246를 2진수로 변환하면 11110110 이다. 그러면 음수가 아닌가요?
		//    246 2진수로 변환하면 -> 1111 0110
		//    246은 byte로 표현 못하고 short(2바이트)로 표현가능
		//    1byte로만 표현하면 산술오버플로워 발생
		//    [0][][][][][][][] [1][1][1][1][0][1][1][0]
		//    산술오버플로워 발생 ***
		//    오버플로워 발생하면 다시 작은 값으로 돌아감 > 책 참고하기
		byte b = (byte)246;
		System.out.println(b); // 결과는 10, 산술 오버플로워 발생됨 잘못된 값으로 쓰레기 이렇게 코딩하면 안됨
		


	}

}
