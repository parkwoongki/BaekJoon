package BaekJoon_15_14889;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_15_14889 {
	private static BufferedWriter writer;
	private static int n;
	private static int[][] s;
	private static boolean[] visited;
	private static int min = Integer.MAX_VALUE;

	public static void dfs(int start, int count) {
		if (count == n / 2) {
			min = Math.min(min, calc());
			return;
		}

		for (int i = start; i < n + 1; i++) {
			if (visited[i] != true) { // 방문하지 않은 경우
				visited[i] = true;
				dfs(i + 1, count + 1);
				visited[i] = false;
			}
		}
	}

	static int calc() {
		int startTeam = 0;
		int linkTeam = 0;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (visited[i] && visited[j]) // Start Team
					startTeam += s[i][j];

				if (visited[i] != true && visited[j] != true) // Link Team
					linkTeam += s[i][j];
			}
		}

		return Math.abs(startTeam - linkTeam);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(reader.readLine());

		s = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 1; j <= n; j++) {
				s[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(1, 0);

		writer.write(min + "");

		reader.close();
		writer.flush();
		writer.close();
	}

}
