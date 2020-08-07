package BaekJoon_10_1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_10_1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(reader.readLine());

		StringTokenizer st = new StringTokenizer(reader.readLine());

		int count = 0;
		for (int i = 0; i < t; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (a == 1)
				continue;

			boolean b = true;
			for (int j = 2; j < a; j++) {
				if (a % j == 0) {
					b = false;
					break;
				}
			}

			if (b)
				count++;
		}

		writer.write(count + "\n");

		writer.flush();
		writer.close();
		reader.close();
	}

}
