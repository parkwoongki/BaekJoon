package BaekJoon_15_2580;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 백트래킹 언제할수 있는지 일단 세로줄과 가로줄, 3x3에 같은게 있으면 백트래킹! 끝까지 도달하면 저장. 그리고 빈칸이 0일때, 끝
 */
public class BaekJoon_15_2580 {
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static int[][] sudoku;
	private static ArrayList<int[]> list; // 빈칸 저장소
	private static boolean check;

	private static void dfs(int count) throws IOException {
		if (count == list.size()) {
			print();
			check = true; // 가능한 판을 찾으면 더 이상 진행할 필요가 없다.
			return;
		}

		if (check) // 이미 가능한 판을 찾았으면 그만 dfs 진행
			return;

		for (int i = 1; i <= 9; i++) {
			int x = list.get(count)[0];
			int y = list.get(count)[1];
			if (isPossible(x, y, i)) {
				sudoku[x][y] = i;
				dfs(count + 1);
				/*
				 * 이미 위에서 가능한 케이스였다면 값 대입이 이루어졌을텐데, 그러면 결과를 찾고 출력까지 했을것이다. 근데 진행을하다가 맞는길이 아니라면
				 * 백트래킹으로 그만 검사하고 또다른 케이스를 검사해야할 텐데, 당연히 깔끔하게 새로운 판에서 검사를 진행해야한다. 그게아니라면 값을
				 * 초기화해서 새로운 판을 만들어야한다.
				 */
				sudoku[x][y] = 0; 
			}
		}

	}

	private static boolean isPossible(int x, int y, int prev) {
		// 열 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[x][i] == prev)
				return false;
		}

		// 행 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][y] == prev)
				return false;
		}

		// 3x3 검사 만약 (1,4)면 두번째 칸
		for (int i = x / 3 * 3; i < x / 3 * 3 + 3; i++) {
			for (int j = y / 3 * 3; j < y / 3 * 3 + 3; j++) {
				if (sudoku[i][j] == prev)
					return false;
			}
		}

		// 다 통과되면 true
		return true;
	}

	private static void print() throws IOException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(sudoku[i][j]).append(" ");
			}
			sb.append("\n");
		}
		writer.write(sb.toString());
	}

	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
		sudoku = new int[9][9];
		list = new ArrayList<int[]>();

		StringTokenizer st;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
				if (sudoku[i][j] == 0)
					list.add(new int[] { i, j });
			}
		}

		dfs(0);

		reader.close();
		writer.flush();
		writer.close();
	}

}
