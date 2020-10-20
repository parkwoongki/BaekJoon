package BaekJoon_16_11054;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_11054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] A = new int[1001];
		int[][] dp = new int[2][1001]; // 0 : 가장 긴 증가하는 부분 수열, 1: 가장 긴 감소하는 부분 수열

		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		dp[0][1] = 1; // 왼쪽 시작
		for (int i = 2; i <= n; i++) {
			dp[0][i] = 1;
			for (int j = 1; j < i; j++) {
				if (A[i] > A[j])
					dp[0][i] = Math.max(dp[0][i], dp[0][j] + 1);
			}
		}

		dp[1][n] = 1; // 오른쪽 시작
		for (int i = n - 1; i > 0; i--) {
			dp[1][i] = 1;
			for (int j = n; j > i; j--) {
				if (A[i] > A[j]) // 시작점이 다를 뿐이라 작은걸 고르는게 아니고 왼쪽에서 시작하는것과 마찬가지로 큰것을 골라서 체크해주면 된다.
					dp[1][i] = Math.max(dp[1][i], dp[1][j] + 1);
			}
		}

		// 두 카운트한 값을 더해서 첫번째에 넣어준다.
		for (int i = 1; i <= n; i++) {
			dp[0][i] += dp[1][i];
		}

		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			if (max < dp[0][i])
				max = dp[0][i];
		}

		writer.write(max - 1 + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}
