package BaekJoon_05_10039;

import java.util.Scanner;

public class BaekJoon_05_10039 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sum = 0, a = 0;
		for (int i = 0; i < 5; i++) {
			a = s.nextInt();

			if (a < 40)
				a = 40;

			sum += a;
		}

		System.out.println(sum / 5);
	}

}
