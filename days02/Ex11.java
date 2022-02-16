package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 5:27:53
 * @subject 음수의 메모리 표현 방법
 * @content
 *          1. 현재 부호와 절대치 사용X
 *            왜? 0 표현방식 2가지 낭비
 *            [0]000 0000
 *            [1]000 0000
 *          
 *          2. 1의 보수법
 *          
 *          3. 2의 보수법(현재 사용)
 *          
 */
public class Ex11 {

	public static void main(String[] args) {
		
		// [][][][][][][][]
		// 0000 1010
		
		// [][][][][][][][]
		byte b = -10;
		
		// 3. 2의 보수법
		/* -10
		 * 1. 절대치 ㅣ-10ㅣ > 10
		 * 2. 2진수로 변환 >                  0000 1010
		 * 3. 1보수 0은 1로, 1은 0으로 바꾸기 1111 0101
		 * 4. +1                              0000 0001
		 * ---------------------------------------------
		 *                                    1111 0110 > 더하게 되면 마지막에 1+1이라 그 다음 자리수로 1이 올라가게 됨
		 */
		
		// 1. 부호와 절대치 사용
		// 양수 10 > [0]000 1010
		// 음수 -10 부호와 절대치 [1]000 1010
		//      ㅣ-10ㅣ
		//       10
		// 2진수     [1]000 1010
		
		// 2. 1의 보수법
		// -10     1의 보수법
		//  ㄱ. 절대치 구하기 > ㅣ-10ㅣ > 10
		//  ㄴ. 2진수 진법 변환 > 0000 1010
		//  ㄷ. 보수            > 1111 0101 == -10
		
	}

}
