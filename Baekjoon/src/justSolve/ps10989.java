package justSolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ps10989 { //조건상 정수의 입력 개수가 천만이나, 입력 정수의 범위는 10000이하이기 때문에
	//정렬 안 하고 int[10001] 정수 배열 만들어 출력하는 것이 빠름.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new  StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i: arr) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
		
		
		
	}

}
