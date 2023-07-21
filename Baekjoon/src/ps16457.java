import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps16457 {
	static int[][] arr;
	static int N, M, K;
	static int max;
	static int[] pick;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new int[M][K];
		pick = new int[N]; //내가 고른 스킬
		
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<K; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		visit = new boolean[2*N+1]; // 들어올 수 있는 스킬 범위
		
		max = 0;
		
		back(1,0);
		
		System.out.println(max);
	}
	
	
	private static void back(int idx, int depth) { //조합
		if(depth == N ) {
			int cnt = 0;
			for(int i=0; i<M; i++) {
				int temp = 0;
				xx: for(int j=0; j<K; j++) {
					for(int p: pick) {
						if(arr[i][j]==p) {
							++temp;
							continue xx;
						}
					}
				}
				if(temp == K) cnt++;
			}
			max = Math.max(max, cnt);
			return;
		}
		for(int i=idx; i<=2*N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				pick[depth] = i;
				back(i, depth+1);
				visit[i] = false;
			}
		}
	}
}