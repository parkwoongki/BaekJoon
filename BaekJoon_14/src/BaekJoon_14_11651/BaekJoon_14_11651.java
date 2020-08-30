package BaekJoon_14_11651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_14_11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		int[][] arr = new int[n][2];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, (e1, e2) -> { // e1, e2는 arr[]가 된다.
			if (e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});

		for (int i = 0; i < arr.length; i++)
			writer.write(arr[i][0] + " " + arr[i][1] + "\n");

		writer.close();
		reader.close();
	}

}
