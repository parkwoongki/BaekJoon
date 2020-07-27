package BaekJoon_06_10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_06_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tk;

		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		tk = new StringTokenizer(reader.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(tk.nextToken());
		}

		int l = a[0];
		for (int i = 1; i < a.length; i++) {
			if (l > a[i])
				l = a[i];
		}

		int s = a[0];
		for (int i = 1; i < a.length; i++) {
			if (s < a[i])
				s = a[i];
		}

		writer.write(l + " " + s);
		
		reader.close();
		writer.flush();
		writer.close();
	}

}
