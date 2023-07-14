package justSolve;

import java.util.Scanner;

public class ps9316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			sb.append("Hello World, Judge ").append(i).append('!').append('\n');
		}
		
		System.out.println(sb);
	}

}
