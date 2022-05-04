package DataStructure;

import java.util.Scanner;

//조작된 평균점수 구하기(점수/최대점수*100)
public class Average {
	public static void main(String[] args) {
		//과목 개수
		Scanner sc = new Scanner(System.in);
		System.out.print("과목개수: ");
		int N = sc.nextInt();
		int[] nums = new int[N];
		//과목 점수
		for(int i=0; i<N; i++) {
			System.out.print((i+1)+"번째 과목점수: ");
			nums[i] = sc.nextInt();
		}
		//조작된 평균 구하기
		long sum = 0;
		long max = 0;
		for(int i=0; i<N; i++) {
			if(max < nums[i]) max = nums[i];
			sum += nums[i];
		}
		//평균점수 출력
		System.out.println("평균점수: "+sum*100.0/max/N);
	}
}
