package BaekJoon_06_8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_06_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			String s = reader.readLine();
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'O') {
					count += 1;
					arr[i] += count;
				} else {
					count = 0;
				}
			}
		}

		for (int j = 0; j < arr.length; j++) {
			writer.write(arr[j] + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
