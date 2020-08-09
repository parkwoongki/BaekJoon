package BaekJoon_10_1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_10_1929 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		boolean[] b = new boolean[e + 1];

		b[1] = true;

		int sq = (int) Math.ceil(Math.sqrt(e));

		for (int i = 2; i <= sq; i++) {
			if (b[i])
				continue;
			for (int j = i * i; j <= e; j += i) {
				b[j] = true;
			}
		}

		for (int i = s; i <= e; i++) {
			if (!b[i])
				writer.write(i + " ");
		}

		writer.flush();
		writer.close();
		reader.close();

	}

}