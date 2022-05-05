package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2차원배열 구간합
public class PrefixSum2 {
	public static void main(String[] args) throws IOException{
		//버퍼호출
		System.out.println("-----2차원 배열 구간 합-----");
		System.out.println("2차원배열 크기, 질의개수 입력(공백사용)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//배열크기, 질의개수, 2차원배열생성
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N+1][N+1];
		//배열 데이터 입력
		System.out.println("행에 들어갈 값 "+(N)+"개 입력");
		for(int i=1; i<=N; i++) {
			System.out.print(i+"행 데이터: ");
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//구간합 배열 생성
		int[][] S = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + A[i][j];
			}
		}
		//구간합 배열 출력
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				System.out.print(S[i][j]+"  ");
			}System.out.println();
		}
		//질의
		for(int i=0; i<M; i++) {
			System.out.print("구간합 범위(x1,x2)(y1,y2): ");
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
			System.out.println("구간합 결과: "+result);
		}
		//결과 호출
	}
}
