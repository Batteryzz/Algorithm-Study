package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ps10710 {
	//���� ���� �����ϸ鼭, �������� now ���� ���Ͽ� min���� �����Ѵ� -> dp (nap)
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
				
				if(j==i) { //i�� j�� ���� ��, �� ���� ù ���� ������ min. �� ��� min �� ���ϸ� �� ��.
					CD[i][j] += CD[i-1][j-1];
					continue;
				}
				//�ش����� ���� �� <-> ������ ������ ���ؼ� min ������ ����.
				CD[i][j] = Math.min(CD[i][j-1], CD[i][j]+CD[i-1][j-1]);
			}
			
		}
		
		System.out.println(CD[N][M]);
		
	}

}
