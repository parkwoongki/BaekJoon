package BaekJoon_11_11729;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_11_11729 {

	public static StringBuffer sb = new StringBuffer();

	public static void hanoi(int n, int start, int remain, int target) throws IOException {
		if (n == 1)
			sb.append(start).append(" ").append(target).append("\n");
		else {
			hanoi(n - 1, start, target, remain); // n-1개의 원판을 남는 타워에 넣는다.
			sb.append(start).append(" ").append(target).append("\n"); // 그리고 남은 원판  1개(가장 큰 원판)를 목적지로 옮긴다.
			hanoi(n - 1, remain, start, target); // 남는 타워에 넣었던 n-1개의 원판을 목적지 타워로 옮긴다.
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		writer.write((int) Math.pow(2, n) - 1 + "\n");
		hanoi(n, 1, 2, 3);
		writer.write(sb.toString());

		writer.flush();
		writer.close();
		reader.close();
	}

}
