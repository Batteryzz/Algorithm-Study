package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps21921 { //푸는 데에 걸리는 시간 : 20분, 헤맨 부분 : temp로 max값 갱신 시 Cnt는 1로 초기화.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		int max = 0;
		int maxCnt = 0;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int temp = 0;

		for (int i = 0; i < X; i++) {
			temp += arr[i];
		} // 첫번째 주기 더해주기

		if (max < temp) {
			max = temp;
			maxCnt = 1;
		} else if(max==temp)
			maxCnt++;

		for (int i = X; i < N; i++) {
			temp -= arr[i-X];
			temp += arr[i];
			
			if (max < temp) {
				max = temp;
				maxCnt = 1;
			} else if(max==temp)
				maxCnt++;
		}
		
		if(max == 0) {System.out.println("SAD"); return;}
		
		System.out.println(max);
		System.out.println(maxCnt);

	}

}
