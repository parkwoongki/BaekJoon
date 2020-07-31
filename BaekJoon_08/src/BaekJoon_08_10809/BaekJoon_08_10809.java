package BaekJoon_08_10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_08_10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] a = new int[26];
		for (int i = 0; i < a.length; i++) {
			a[i] = -1;
		}

		String s = reader.readLine();
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i); // ¸¸¾à b¸é
			int n = (int) c - 97;
			if (a[n] == -1)
				a[n] = i;
		}

		for (int i = 0; i < a.length; i++) {
			writer.write(a[i] + " ");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
