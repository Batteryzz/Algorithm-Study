package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps1342 {
	static int length;
	static int[] word;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		word = new int[26];
		count = 0;
		length = str.length();

		for (int i = 0; i < length; i++) {
			word[str.charAt(i) - 'a']++;
		}

		perm(0, 26);
		System.out.println(count);

	}
	// visit�迭�� ���� �����ʿ� ����, ���ĺ� ������ŭ �迭�� ��� �̾Ƽ� ��.
	// ������ ���� ���� ���ĺ� ���� �ܷ� ���, alphabet�� �������� Ÿ���� ���� �ʴٸ� ����. --; ó�� �� dfs(����)
	// �̷��� �ϸ� �ߺ� ���ſ� �翷�� ��� ���� ������ ���� �䱸 ����ó�� ��.
	static void perm(int depth, int alphabet) { 
		if (length == depth) {
			count++;
			return;
		}

		for (int i = 0; i < 26; i++) {
			if (word[i] == 0)
				continue;
			if (alphabet != i) {
				word[i]--;
				perm(depth + 1, i);
				word[i]++;
			}
		}
	}

}
