package BaekJoon_13_7568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_13_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(reader.readLine());

		int[] ws = new int[n];
		int[] hs = new int[n];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			ws[i] = Integer.parseInt(st.nextToken());
			hs[i] = Integer.parseInt(st.nextToken());

			for (int j = 0; j < i; j++) {
				if (ws[j] > ws[i] && hs[j] > hs[i])
					c[i]++;
				if (ws[j] < ws[i] && hs[j] < hs[i])
					c[j]++;
			}
		}

		for (int i : c)
			writer.write((i + 1) + " ");

		writer.flush();
		writer.close();
		reader.close();
	}

}
