package BaekJoon_06_1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_06_1546 {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		int a[] = new int[n];

		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		double l = a[0];
		for (int i = 1; i < a.length; i++) {
			if (l < a[i])
				l = a[i];
		}

		double sum = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum += (a[i] / l) * 100;
		}

		writer.write(sum / n + "");

		writer.flush();
		writer.close();
	}

}
