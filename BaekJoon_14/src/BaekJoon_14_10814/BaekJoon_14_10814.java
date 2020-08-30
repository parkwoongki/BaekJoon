package BaekJoon_14_10814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_14_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		String[][] sarr = new String[n][2];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			sarr[i][0] = st.nextToken();
			sarr[i][1] = st.nextToken();
		}

		Arrays.sort(sarr, (e1, e2) -> {
			if (Integer.parseInt(e1[0]) < Integer.parseInt(e2[0])) {
				return -1;
			} else if (Integer.parseInt(e1[0]) == Integer.parseInt(e2[0])) {
				return 0; // 같으면 가만히
			}
			return 1;
		});

		for (String[] a : sarr) {
			writer.write(a[0] + " " + a[1] + "\n");
		}

		writer.close();
		reader.close();
	}

}
