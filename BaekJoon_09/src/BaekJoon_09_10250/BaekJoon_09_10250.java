package BaekJoon_09_10250;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_09_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(reader.readLine());

		for (int i = 0; i < len; i++) {

			StringTokenizer st = new StringTokenizer(reader.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			int a = n % h;
			double b = (double) n / h + 1;
			if (a == 0)
				a = h;
			if (b == Math.floor(b))
				b -= 1;

			if (b < 10)
				writer.write(a + "0" + (int) b + "\n");
			else
				writer.write(a + "" + (int) b + "\n");

		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
