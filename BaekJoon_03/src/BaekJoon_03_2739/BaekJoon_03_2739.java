package BaekJoon_03_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_03_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
//		StringTokenizer t = new StringTokenizer(reader.readLine());
//		int a = Integer.parseInt(t.nextToken());

		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}

}
