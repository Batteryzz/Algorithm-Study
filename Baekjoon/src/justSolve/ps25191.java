package justSolve;

import java.util.Scanner;

public class ps25191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A /=2;
		
		if(N>=(A+B)){System.out.println(A+B);}
		else System.out.println(N);
		
	}

}
