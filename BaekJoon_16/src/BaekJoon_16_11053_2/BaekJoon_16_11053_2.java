package BaekJoon_16_11053_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_16_11053_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] A = new int[1001];
		
		A[0] = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		List<Integer> dp = new ArrayList<Integer>();
		dp.add(A[1]);
		int max = Integer.MIN_VALUE;
		for (int i = 2; i <= n; i++) {
			if (max < A[i]) {
				max = A[i];
				dp.add(A[i]);
			}
		}

		writer.write(dp.size() + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}
