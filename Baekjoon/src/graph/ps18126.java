package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ps18126 {
	static ArrayList<Node>[] arr;
	static boolean[] visit;
	static int N;
	static long max=0;
	static class Node {
		int C;
		long V;

		public Node(int c, long v) {
			C = c;
			V = v;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new ArrayList[N + 1];
		visit = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i =1; i <= N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			arr[A].add(new Node(B, C));
			arr[B].add(new Node(A, C));//�����
		}
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(1, 0));
		visit[1] = true;
		while(!q.isEmpty()) {
			Node now = q.poll();
			max = Math.max(max, now.V);
			for(Node next:arr[now.C]) {
				if(visit[next.C])continue; //�̹� �鸰 �� �ѱ�
				q.add(new Node(next.C, now.V+next.V)); //���ݱ��� + �������� ��
				visit[next.C]=true;
			}
		}
		System.out.println(max);

	}

}
