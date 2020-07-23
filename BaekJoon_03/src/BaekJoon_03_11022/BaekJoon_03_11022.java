package BaekJoon_03_11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_03_11022 {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());

		int a = 0, b = 0;
		StringTokenizer tokenizer;
		for (int i = 0; i < n; i++) {
			tokenizer = new StringTokenizer(reader.readLine());
			a = Integer.parseInt(tokenizer.nextToken());
			b = Integer.parseInt(tokenizer.nextToken());
			writer.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + '\n');
		}

		writer.flush();
		writer.close();
	}

}
