package BaekJoon_10_4153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_10_4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		List<Integer> l = new ArrayList<Integer>();

		while (true) {
			st = new StringTokenizer(reader.readLine());
			l.clear();

			for (int i = 0; i < 3; i++) {
				l.add(Integer.parseInt(st.nextToken()));
			}

			Collections.sort(l);

			int a = l.get(0);
			int b = l.get(1);
			int c = l.get(2);

			if (a == 0 && b == 0 && c == 0)
				break;

			if ((a * a) + (b * b) == (c * c))
				writer.write("right\n");
			else
				writer.write("wrong\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
