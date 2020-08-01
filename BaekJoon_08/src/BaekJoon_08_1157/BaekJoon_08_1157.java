package BaekJoon_08_1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_08_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = reader.readLine();
		int[] a = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char c = Character.toUpperCase(s.charAt(i));
			a[((int) c) - 65]++;
		}

		int tmp = a[0];
		char l = 65;
		boolean b = true;
		for (int i = 1; i < a.length; i++) {
			if (tmp < a[i]) {
				tmp = a[i];
				l = (char) (i + 65);
				b = true;
			} else if (tmp == a[i]) {
				b = false;
			}
		}

		if (b)
			writer.write(l + "");
		else
			writer.write("?");

		writer.flush();
		writer.close();
		reader.close();
	}

}
