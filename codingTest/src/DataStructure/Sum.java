package DataStructure;

import java.util.Scanner;

//공백없는 수의 합 구하기
public class Sum {
	public static void main(String[] args) {
		//숫자개수
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자갯수: ");
		int N = sc.nextInt();
		//문자열로 받기
		System.out.print("더할 숫자들: ");
		String sNum = sc.next();
		//문자배열로 변환
		char[] cNum = sNum.toCharArray();
		//정수형 변환
		int sum = 0;
		//숫자 더하기
		for(int i=0; i<cNum.length; i++)
			sum += cNum[i]-'0';
			//sum += cNum[i]-48;
		//결과 출력
		System.out.println("총합: "+sum);
		
	}
}
