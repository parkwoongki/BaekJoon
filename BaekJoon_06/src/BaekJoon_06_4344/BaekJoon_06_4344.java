package BaekJoon_06_4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_06_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		double[] dr = new double[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int c = Integer.parseInt(st.nextToken());
			double[] darr = new double[c];
			double avg = 0.0;

			for (int j = 0; j < c; j++) {
				darr[j] = Integer.parseInt(st.nextToken());
				avg += darr[j];
			}
			avg /= c;

			double count = 0;
			for (int j = 0; j < c; j++) {
				if (darr[j] > avg)
					count++;
			}

			dr[i] = (count / c) * 100;

		}

		for (int i = 0; i < dr.length; i++) {
			writer.write(String.format("%.3f", dr[i]) + "%\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
