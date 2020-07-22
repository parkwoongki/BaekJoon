package BaekJoon_03_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_03_8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
