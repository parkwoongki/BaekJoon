import java.util.Scanner;

public class BaekJoon_01_2588 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int a, b;
		while (true) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a >= 100 && a <= 999 && b >= 100 && b <= 999)
				break;
		}

		int i = a * (b % 10);
		int j = a * ((b % 100) / 10);
		int k = a * (b / 100);

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

		System.out.println(i + j * 10 + k * 100);
	}
}
