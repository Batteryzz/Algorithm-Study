package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ps10710 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> cities = new ArrayList<>();
		ArrayList<Integer> diffs = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			cities.add(a);
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			diffs.add(a);
		}
		
		Collections.sort(cities, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		Collections.sort(diffs, new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		ArrayList<Integer> sortedDiffs = new ArrayList<>();
		
		for(int i=N-1; i>=0; i--) {
			sortedDiffs.add(diffs.get(i));
		}
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += cities.get(i)*sortedDiffs.get(i);
		}
		
		System.out.println(sum);
		
	}

}
