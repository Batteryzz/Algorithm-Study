package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ps1448 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		int max = -1;
		
		for(int i=N-1; i>=2; i--) {
			int L = list.get(i);
			int S1 = list.get(i-1);
			int S2 = list.get(i-2);
			
			if(S1+S2>L) {
				int temp = L+S1+S2;
				max = Math.max(max, temp);
				break;
			}
		}
		System.out.println(max);
		
	}

}
