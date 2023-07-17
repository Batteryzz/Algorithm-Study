package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps1547 {

	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int target = 1;
		
		int left = 0;
		int right = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			left = Integer.parseInt(st.nextToken());
			right = Integer.parseInt(st.nextToken());
			
			if(target==left) {
				target = right;
				continue;
			}
			
			if(target==right) {
				target = left;
				continue;
			}
			
			if(target>=4) {
				System.out.println(-1);
				return;
			}
			
		}
		
		System.out.println(target);
		
		
	}

}
