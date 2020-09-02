package BaekJoon_15_9663;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_15_9663 {
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static int n, count;
	private static int[] col;

	private static void dfs(int row) {
		if (row == n) { // n열까지 검사 완료되면 성공 (끝자락이므로)
			count++;
		} else {
			for (int i = 1; i <= n; i++) {
				col[row + 1] = i; // 다음 행의 1열 부터 n열까지 검사 실시
				if (isPossible(row + 1)) // 이게 가능하면 dfs를 다시 recursive
					dfs(row + 1);
				else
					col[row + 1] = 0; // 만약 가능하지 않다면 더이상 dfs를 진행하지 않는다 => 백트래킹!
			}
			col[row] = 0; // 종료 전에 0으로 다시 초기화 해준다.
		}
	}

	private static boolean isPossible(int row) {
		// col[1]의 의미는 1행 *열이다.
		// col[1] = 1 => 1행 1열, col[2] = 3 => 2행 3열
		for (int i = 1; i < row; i++) {
			// 행이 같을때 열이 같은건 이미 앞전에 걸러짐 왜냐면 col[m]에 들어가는 애들은 1 2,3 4.. 이렇게 나눠서 들어가기 때문에 당연히
			// 열은 중복이 당연히 될수가 없다. 행의 구분만 있으면 완료.col안의 값이 행이니까 같은걸 골라내면됨
			if (col[i] == col[row]) 
				return false;
			if (Math.abs(col[i] - col[row]) == Math.abs(i - row)) // 대각선에 위치하는 x의 값과 y의 값이 같으면 대각선에 위치하는 거라 불가능
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(reader.readLine());

		col = new int[15]; // 15전 까지 (0은 안쓴다.)

		for (int i = 1; i <= n; i++) { // i는 열이다. 먼저 첫번째 열을 주루룩 검사한다. 처음은 1부터 검사한다.
			col[1] = i; // 이렇게되면 1열 i행 이런뜻이다..
			dfs(1);
		}

		writer.write(count + "");

		reader.close();
		writer.flush();
		writer.close();
	}

}
