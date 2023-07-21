import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.management.Query;

public class ps27971 {
	static int N, M, A, B;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		int[] arr = new int[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			for (int a = left; left <= right; left++) {
				arr[left] = 101;
			}

			Queue<Integer> q = new LinkedList<>();
			int cnt = 0;
			int index = 0;

			int first = 0;
			int second = 0;

			if (A > B) {
				first = A;
				second = B;
			} else {
				first = B;
				second = A;
			}

			q.add(first);

			while (!q.isEmpty()) {
				int now = q.poll();
				
				if(index+now > N ) {
					if(index +)
				}
				
				if (arr[index + now] != 101) {
					cnt++;
					index += now;
					q.add(first);
				} else {
					if (arr[index + second] != 101) {
						cnt++;
						index += second;
						q.add(first);
					}
				}

			}
			System.out.println(cnt);

		}

	}

}
