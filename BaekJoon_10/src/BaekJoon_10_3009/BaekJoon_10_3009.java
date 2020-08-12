package BaekJoon_10_3009;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_10_3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		List<String> x = new ArrayList<>();
		List<String> y = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(reader.readLine());

			String t1 = st.nextToken();
			String t2 = st.nextToken();

			if (x.contains(t1))
				x.remove(t1);
			else
				x.add(t1);

			if (y.contains(t2))
				y.remove(t2);
			else
				y.add(t2);
		}

		writer.write(x.get(0) + " " + y.get(0));

		writer.flush();
		writer.close();
		reader.close();
	}

}
