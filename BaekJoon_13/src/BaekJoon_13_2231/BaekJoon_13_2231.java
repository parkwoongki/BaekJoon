package BaekJoon_13_2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_13_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		String s = st.nextToken();
		int len = s.length();
		int n = Integer.parseInt(s);

		for (int i = 0; i < n; i++) {
			int con = i;
			int tmp = i;
			for (int j = 0; j < len; j++) {
				con += tmp % 10;
				tmp = tmp / 10;
			}
			if (con == n) {
				writer.write(i + "");
				writer.flush();
				writer.close();
				reader.close();
				return;
			}
		}
		writer.write(0 + "");
		writer.flush();
		writer.close();
		reader.close();
	}

}
