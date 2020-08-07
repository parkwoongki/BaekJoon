package BaekJoon_09_1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_09_1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		long t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			long start = Integer.parseInt(st.nextToken());
			long end = Integer.parseInt(st.nextToken());

			long dis = end - start;
			long move = 0;
			long count = 1;

			while (move < dis) {
				count++;
				move += (count / 2);
			}

			writer.write(count - 1 + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
