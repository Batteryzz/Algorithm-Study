import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int N, M, K;
	static int max;
	static int[] pick;
	static boolean[] visit;
	static ArrayList<Integer> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[M][K];
		pick = new int[N]; // 내가 고른 스킬

		list = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < K; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (!list.contains(arr[i][j]))
					list.add(arr[i][j]);
			}
		}
		visit = new boolean[list.size()]; // 내가 고른 스킬

		max = 0;

		back(0);

		System.out.println(max);

	}

	private static void back(int idx) {
		if (idx == N) {
			int cnt = 0;
			for (int i = 0; i < M; i++) {
				int temp = 0;
				xx: for (int j = 0; j < K; j++) {
					for (int p : pick) {
						if (arr[i][j] == p) {
							++temp;
							continue xx;
						}
					}
				}
				if (temp == K)
					cnt++;
			}
			max = Math.max(max, cnt);
			return;
		}

		for (int i = 0; i < list.size(); i++) {
			if (!visit[i]) {
				visit[i] = true;
				pick[idx] = list.get(i);
				back(idx + 1);
				visit[i] = false;
			}
		}
	}
}