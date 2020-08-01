package BaekJoon_08_2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_08_2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();

			String t = "";
			for (int j = 0; j < s.length(); j++) {
				for (int j2 = 0; j2 < a; j2++) {
					t += s.charAt(j);
				}
			}

			writer.write(t + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
