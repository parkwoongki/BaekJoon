package BaekJoon_14_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_14_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] input = new int[10001];

		for (int i = 0; i < n; i++) {
			input[Integer.parseInt(reader.readLine())]++;
		}

		for (int i = 0; i < 10000 + 1; i++) {
			if (input[i] != 0) {
				for (int j = 0; j < input[i]; j++) {
					writer.write(String.valueOf(i));
					writer.newLine();
				}
			}
		}
		writer.close();
		reader.close();
	}

}
