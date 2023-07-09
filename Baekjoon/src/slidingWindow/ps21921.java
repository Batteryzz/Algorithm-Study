package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps21921 { //Ǫ�� ���� �ɸ��� �ð� : 20��, ��� �κ� : temp�� max�� ���� �� Cnt�� 1�� �ʱ�ȭ.

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
		} // ù��° �ֱ� �����ֱ�

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
