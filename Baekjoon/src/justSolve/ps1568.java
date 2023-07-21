package justSolve;

import java.util.Scanner;

public class ps1568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sing = 1;
		int cnt = 0;
		
		while(N!=0) {
			if(N - sing <0) sing = 1;
			N -= sing++;
			cnt++;
		}
		System.out.println(cnt);
	}

}
