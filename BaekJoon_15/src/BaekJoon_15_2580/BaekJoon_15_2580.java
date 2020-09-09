package BaekJoon_15_2580;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * ��Ʈ��ŷ �����Ҽ� �ִ��� �ϴ� �����ٰ� ������, 3x3�� ������ ������ ��Ʈ��ŷ! ������ �����ϸ� ����. �׸��� ��ĭ�� 0�϶�, ��
 */
public class BaekJoon_15_2580 {
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static int[][] sudoku;
	private static ArrayList<int[]> list; // ��ĭ �����
	private static boolean check;

	private static void dfs(int count) throws IOException {
		if (count == list.size()) {
			print();
			check = true; // ������ ���� ã���� �� �̻� ������ �ʿ䰡 ����.
			return;
		}

		if (check) // �̹� ������ ���� ã������ �׸� dfs ����
			return;

		for (int i = 1; i <= 9; i++) {
			int x = list.get(count)[0];
			int y = list.get(count)[1];
			if (isPossible(x, y, i)) {
				sudoku[x][y] = i;
				dfs(count + 1);
				/*
				 * �̹� ������ ������ ���̽����ٸ� �� ������ �̷�������ٵ�, �׷��� ����� ã�� ��±��� �������̴�. �ٵ� �������ϴٰ� �´±��� �ƴ϶��
				 * ��Ʈ��ŷ���� �׸� �˻��ϰ� �Ǵٸ� ���̽��� �˻��ؾ��� �ٵ�, �翬�� ����ϰ� ���ο� �ǿ��� �˻縦 �����ؾ��Ѵ�. �װԾƴ϶�� ����
				 * �ʱ�ȭ�ؼ� ���ο� ���� �������Ѵ�.
				 */
				sudoku[x][y] = 0; 
			}
		}

	}

	private static boolean isPossible(int x, int y, int prev) {
		// �� �˻�
		for (int i = 0; i < 9; i++) {
			if (sudoku[x][i] == prev)
				return false;
		}

		// �� �˻�
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][y] == prev)
				return false;
		}

		// 3x3 �˻� ���� (1,4)�� �ι�° ĭ
		for (int i = x / 3 * 3; i < x / 3 * 3 + 3; i++) {
			for (int j = y / 3 * 3; j < y / 3 * 3 + 3; j++) {
				if (sudoku[i][j] == prev)
					return false;
			}
		}

		// �� ����Ǹ� true
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
