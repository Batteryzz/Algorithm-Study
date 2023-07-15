package justSolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps1371 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] alpha = new int[26];
		
		while(str!=null) {
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==' ') continue;
				int cnt = str.charAt(i)-'a';
				++alpha[cnt];
			}
			
			str = br.readLine();
		}
		
		int max = 0;
		for(int i : alpha) {
			max = Math.max(max, i);
		}
		
		for(int i=0; i<26; i++) {
			if(alpha[i]==max) {
				System.out.print((char)(i+'a'));
				
			}
		}
		
	}

}
