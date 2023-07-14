package bruteForce;

import java.util.Scanner;
import java.util.Stack;

public class ps23284 {
	static boolean[] arr;
	static int N;
	static StringBuilder sb;
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		sb = new StringBuilder();
		arr = new boolean[N * 2];
		visit = new boolean[N*2];
		dfs(1, 0);
		System.out.println(sb);

	}

	private static void dfs(int depth, int pick) {
		if (N == pick) {
			Stack<Integer> st = new Stack<>();
			int idx = 1;
			for (int i = 0; i < N*2; i++) {
				if (arr[i]) {
					st.push(idx++);
				} else {
					sb.append(st.pop()).append(' ');
				}
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N*2-1 ; i++) {
			if (!visit[i]) {
				visit[i] = true;

				if (pick < depth && pick < N) {
					arr[i] = true;
					dfs(depth, pick + 1);
					arr[i] = false;
				} else {
					arr[i] = false;
					dfs(depth + 1, pick);
					arr[i] = true;
				}
			}
			visit[i] = false;
		}

		
	}

}
