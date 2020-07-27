package BaekJoon_06_2562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_06_2562 {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] a = new int[9];

		for (int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		int l = a[0], w = 1;
		for (int i = 1; i < a.length; i++) {
			if (l < a[i]) {
				l = a[i];
				w = i + 1;
			}
		}

		writer.write(l + "\n" + w);

		reader.close();
		writer.flush();
		writer.close();
	}

}
