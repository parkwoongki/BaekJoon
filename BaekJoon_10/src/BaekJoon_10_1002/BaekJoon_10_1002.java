package BaekJoon_10_1002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_10_1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(reader.readLine());
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double r1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double r2 = Double.parseDouble(st.nextToken());

			double s = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

			if (s == 0.0) {
				if (r1 == r2)
					writer.write(-1 + "\n");
				else
					writer.write(0 + "\n");
			} else if (r1 > s + r2)
				writer.write(0 + "\n");
			else if (r2 > s + r1)
				writer.write(0 + "\n");
			else if (r1 == s + r2)
				writer.write(1 + "\n");
			else if (r2 == s + r1)
				writer.write(1 + "\n");
			else if (s < r1 + r2)
				writer.write(2 + "\n");
			else if (s == r1 + r2)
				writer.write(1 + "\n");
			else if (s > r1 + r2)
				writer.write(0 + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
