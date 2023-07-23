import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps27971 {
	static int N, M, A, B;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		int X = -1;

		int[] arr = new int[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			for (int a = left; left <= right; left++) {
				arr[left] = X;
			}
		}

		for (int i = 1; i <= N; i++) {
			if (arr[i] == X)
				continue;

			int left = X;
			int right = X;

			if (i - A >= 0 && arr[i - A] != X) {
				left = i - A;
			}

			if (i - B >= 0 && arr[i - B] != X) {
				right = i - B;
			}

			if (left == X || right == X) {

				if (left == X && right == X) {
					arr[i] = X;
					continue;
				} else if (left == X) {
					arr[i] = arr[right] + 1;
					continue;
				} else if (right == X) {
					arr[i] = arr[left] + 1;
					continue;
				}

			}

			arr[i] = Math.min(arr[left] + 1, arr[right] + 1);

		}

		if (arr[N] <= 0) {
			System.out.println(-1);
		} else
			System.out.println(arr[N]);
		
		/*  for (int i = 1; i <= N; ++i) 좋은 풀이!
	            if (!blocked[i]) {
	                if (i - A >= 0 && !blocked[i - A])
	                    dp[i] = Math.min(dp[i - A], dp[i]);
	                if (i - B >= 0)
	                    dp[i] = Math.min(dp[i - B], dp[i]);
	                dp[i]++;
	            }*/

	}

}
