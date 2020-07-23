package BaekJoon_03_10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_03_10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int a = 1;
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(st.nextToken());
			if (a < x)
				writer.write(a + " ");
		}
		
		writer.flush();
		writer.close();
	}

}
