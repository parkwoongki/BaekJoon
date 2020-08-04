package BaekJoon_08_1316;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_08_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean[] check = new boolean[26];
			String s = reader.readLine();
			char[] c = s.toCharArray();
			boolean b = true;

			check[(int) (c[0] - 97)] = true;
			for (int j = 1; j < c.length; j++) {
				if (check[(int) (c[j] - 97)] == false) {
					check[(int) (c[j] - 97)] = true;
				} else if (c[j - 1] != c[j]) {
					b = false;
					break;
				}
			}

			if (b)
				count++;
		}

		writer.write(count + "");

		writer.flush();
		writer.close();
		reader.close();
	}

}
