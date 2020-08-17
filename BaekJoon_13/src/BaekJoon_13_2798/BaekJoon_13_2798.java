package BaekJoon_13_2798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_13_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		int tmp = 0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i + 1; j < n-1; j++) {
				for (int j2 = j+1; j2 < n; j2++) {
					tmp = arr[i] + arr[j] + arr[j2];
					if (tmp > max && tmp <= m) {
						max = tmp;
					}
				}
			}
		}
		System.out.println(max);

		writer.flush();
		writer.close();
		reader.close();
	}

}
