package justSolve;

import java.util.Scanner;

public class ps1731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			System.out.println(arr[N-1]+(arr[1]-arr[0]));
		} else {
			System.out.println(arr[N-1]*(arr[1]/arr[0]));
		}
	}

}
