package BaekJoon_16_2565;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon_16_2565 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[][] w = new int[n + 1][2];
		int[] dp = new int[n + 1];

		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(reader.readLine());
			w[i][0] = Integer.parseInt(st.nextToken());
			w[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(w, new Comparator<int[]>() { // 오름차 정렬
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = 1; // 기준 최저인 1로 설정해두고 큰값나올때마다 수정
			for (int j = 1; j < i; j++) {
				if (w[i][1] > w[j][1])
					dp[i] = Math.max(dp[j] + 1, dp[i]); // 지금것보다 크면 계속 업데이트
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (max < dp[i])
				max = dp[i];
		}

		writer.write(n - max + " ");

		writer.flush();
		reader.close();
		writer.close();
	}

}
