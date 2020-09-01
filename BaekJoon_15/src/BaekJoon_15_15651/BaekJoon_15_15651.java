package BaekJoon_15_15651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_15_15651 {
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static int n, m;
	private static int list[];
	private static StringBuilder sb;

	private static void dfs(int cnt) {
		if (cnt == m) {
			for (int i = 0; i < m; i++) {
				sb.append(list[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			list[cnt] = i;
			dfs(cnt + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		list = new int[m];

		sb = new StringBuilder();

		dfs(0);

		writer.write(sb.toString());

		reader.close();
		writer.close();
	}

}
