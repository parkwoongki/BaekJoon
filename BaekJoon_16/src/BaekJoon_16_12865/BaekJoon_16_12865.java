package BaekJoon_16_12865;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_12865 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken()); // 1 ~ 100
		int K = Integer.parseInt(st.nextToken()); // 1 ~ 100,000

		int[][] arr = new int[N + 1][2]; // 0:W(무게), 1:V(가치)
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(reader.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

//		for (int i = 1; i <= N; i++) {
//			System.out.println(arr[i][0] + " " + arr[i][1]);
//		}

		int[][] dp = new int[K + 1][2]; // 0:W(무게), 1:V(가치)
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				if (dp[arr[i][0]][0] + arr[j][0] <= K) {
					dp[arr[i][0]][0] += arr[j][0];
					dp[arr[i][0]][1] += arr[j][1];
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= K; i++) {
			System.out.println(i+": "+dp[i][1] + " ");
			max = Math.max(max, dp[i][1]);
		}

		writer.write(max + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}
