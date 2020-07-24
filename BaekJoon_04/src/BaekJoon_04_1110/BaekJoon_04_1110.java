package BaekJoon_04_1110;

import java.util.Scanner;

public class BaekJoon_04_1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		int n = 0, t, b = a;
		while (true) {
			t = b / 10 + b % 10;

			b = (b % 10) * 10 + (t % 10);
			n++;

			if (a == b)
				break;
		}

		System.out.println(n);
	}

}
