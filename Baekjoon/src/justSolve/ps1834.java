package justSolve;

import java.util.Scanner;

public class ps1834 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long sum = 0;
		for (int i = 1; i < N; i++) {
			sum += (long) i * N + i;
		}
		System.out.println(sum);

	}
}
