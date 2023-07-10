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
	// visit배열로 순열 만들필요 없이, 알파벳 개수만큼 배열에 담아 뽑아서 씀.
	// 순열의 시작 값을 알파벳 범위 외로 잡고, alphabet과 담으려는 타깃이 같지 않다면 선택. --; 처리 후 dfs(순열)
	// 이렇게 하면 중복 제거와 양옆을 모두 보는 것으로 문제 요구 사항처리 됨.
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
