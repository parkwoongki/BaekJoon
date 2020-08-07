package BaekJoon_09_2775;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_09_2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(reader.readLine());
		int[][] a = new int[15][15];

		for (int i = 0; i < 15; i++) {
			a[0][i] = i + 1;
			a[i][0] = 1;
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				a[i][j] = a[i - 1][j] + a[i][j - 1];
			}
		}

//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < len; i++) {
			int k = Integer.parseInt(reader.readLine());
			int n = Integer.parseInt(reader.readLine());

			writer.write(a[k][n-1] + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
