package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ps1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());// �Է� ���� ����
		int K = Integer.parseInt(st.nextToken());// �ʿ��� ��������

		int[] arr = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}

		long left = 1; //0���δ� �ڸ� �� ���� ���� �� 1��
		long right = max;

		while (left <= right) {//left�� right
			long mid = (left + right) / 2;

			long temp = 0;

			for (int i : arr) {
				temp += i / mid;
			}

			if (temp < K) { //right���� left �� �־��� �� temp < K ����� ��ġ�� �ʵ��� ����
				right = mid-1;
			} else
				left = mid+1; 

		}
		
		System.out.println(right); //���� right ���(ū ��)

	}

}
