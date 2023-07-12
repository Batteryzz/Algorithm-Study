package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ps2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> listMax = new ArrayList<>();
		
		for(int i=2; i<=N; i++) {
			
			while(N%i == 0 && M%i == 0) {
				listMax.add(i);
				N /=i; M/=i;
			}
		}
		
		int max = 1;
		
		for(int i : listMax) {
			max *=i;
		}
		
		
		System.out.println(max);
		System.out.println(max*N*M);
	}

}
