package DataStructure;

import java.io.*;
import java.util.StringTokenizer;

//구간 합 구하기
public class PrefixSum {
	public static void main(String[] args) throws IOException{
		System.out.println("-----구간합 구하기-----");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//데이터길이, 질문개수
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		long[] S = new long[suNo+1];
		System.out.println("-----구간합 데이터 입력-----");
		st = new StringTokenizer(br.readLine());
		//합배열 생성
		for(int i=1; i<=suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		//구간합 범위 받기 및 출력
		for(int q=0; q<quizNo; q++) {
			System.out.print(q+"번째 구간합 범위 받기: ");
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println("-결과: "+(long)(S[j]-S[i-1]));
		}
	}
}
