package justSolve;

import java.util.Scanner;

public class ps1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		while (!str.equals("#")) {
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				char now = str.charAt(i);
				if (now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u' || now == 'A' || now == 'E'
						|| now == 'I' || now == 'O' || now == 'U') {
					++cnt;
				}
			}

			System.out.println(cnt);
			str = sc.nextLine();

		}
	}

}
