package BaekJoon_14_10814_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_14_10814_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		StringBuffer[] sb = new StringBuffer[201];
		for (int i = 0; i < sb.length; i++) {
			sb[i] = new StringBuffer();
		}

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			sb[age].append(age).append(" ").append(name).append("\n");
		}

		for (StringBuffer a : sb) {
			writer.write(a.toString());
		}

		writer.close();
		reader.close();
	}

}
