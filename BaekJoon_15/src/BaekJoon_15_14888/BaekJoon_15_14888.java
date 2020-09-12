package BaekJoon_15_14888;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_15_14888 {
	private static BufferedWriter writer;
	private static int n;
	private static int[] operand;
	private static int[] operator; // 0:+ 1:- 2:* 3:/
	private static int max, min;

	private static void dfs(int count, int sum) {
		if (count == n) {
			if (max < sum)
				max = sum;
			if (min > sum)
				min = sum;
			return;
		}

		for (int i = 0; i < operator.length; i++) {
			if (operator[i] == 0)
				continue;

			operator[i]--;
			switch (i) {
			case 0:
				dfs(count + 1, sum + operand[count]);
				break;
			case 1:
				dfs(count + 1, sum - operand[count]);
				break;
			case 2:
				dfs(count + 1, sum * operand[count]);
				break;
			case 3:
				dfs(count + 1, sum / operand[count]);
				break;
			}
			operator[i]++;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(reader.readLine());

		st = new StringTokenizer(reader.readLine());
		operand = new int[n];
		for (int i = 0; i < n; i++) {
			operand[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(reader.readLine());
		operator = new int[4];
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}

		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;

		dfs(1, operand[0]);

		writer.write(max + "\n" + min + "\n");

		reader.close();
		writer.flush();
		writer.close();
	}

}
