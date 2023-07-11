package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ps10710 {
	//이전 값을 저장하면서, 이전값과 now 값을 비교하여 min값을 갱신한다 -> dp (nap)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] cities = new int[N+1];
		int[] diffs = new int[M+1];
		int[][] CD = new int[N+1][M+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			cities[i] = a;
		}
		
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			diffs[i] = a;
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=i; j<=i+M-N; j++) {
				CD[i][j] = cities[i] * diffs [j] ;
				
				if(j==i) { //i와 j가 같은 즉, 각 행의 첫 열은 무조건 min. 전 행과 min 값 비교하면 안 됨.
					CD[i][j] += CD[i-1][j-1];
					continue;
				}
				//해당행의 전열 과 <-> 전행의 전열을 비교해서 min 값으로 설정.
				CD[i][j] = Math.min(CD[i][j-1], CD[i][j]+CD[i-1][j-1]);
			}
			
		}
		
		System.out.println(CD[N][M]);
		
	}

}
