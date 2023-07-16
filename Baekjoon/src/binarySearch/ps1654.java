package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());// 입력 랜선 개수
		int K = Integer.parseInt(st.nextToken());// 필요한 랜선개수

		int[] arr = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}

		long left = 1; //0으로는 자를 수 없음 시작 값 1로
		long right = max;

		while (left <= right) {//left가 right
			long mid = (left + right) / 2;

			long temp = 0;

			for (int i : arr) {
				temp += i / mid;
			}

			if (temp < K) { //right값과 left 값 넣었을 때 temp < K 결과값 겹치지 않도록 구성
				right = mid-1;
			} else
				left = mid+1; 

		}
		
		System.out.println(right); //답은 right 출력(큰 값)

	}

}
