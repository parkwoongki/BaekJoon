import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_02_9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(tokenizer.nextToken());
		
		switch (a / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}

//		if (a <= 100 && a >= 90)
//			System.out.println("A");
//		else if (a <= 89 && a >= 80)
//			System.out.println("B");
//		else if (a <= 79 && a >= 70)
//			System.out.println("C");
//		else if (a <= 69 && a >= 60)
//			System.out.println("D");
//		else
//			System.out.println("F");
	}

}
