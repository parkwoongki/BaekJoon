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
		if (row == n) { // n������ �˻� �Ϸ�Ǹ� ���� (���ڶ��̹Ƿ�)
			count++;
		} else {
			for (int i = 1; i <= n; i++) {
				col[row + 1] = i; // ���� ���� 1�� ���� n������ �˻� �ǽ�
				if (isPossible(row + 1)) // �̰� �����ϸ� dfs�� �ٽ� recursive
					dfs(row + 1);
				else
					col[row + 1] = 0; // ���� �������� �ʴٸ� ���̻� dfs�� �������� �ʴ´� => ��Ʈ��ŷ!
			}
			col[row] = 0; // ���� ���� 0���� �ٽ� �ʱ�ȭ ���ش�.
		}
	}

	private static boolean isPossible(int row) {
		// col[1]�� �ǹ̴� 1�� *���̴�.
		// col[1] = 1 => 1�� 1��, col[2] = 3 => 2�� 3��
		for (int i = 1; i < row; i++) {
			// ���� ������ ���� ������ �̹� ������ �ɷ��� �ֳĸ� col[m]�� ���� �ֵ��� 1 2,3 4.. �̷��� ������ ���� ������ �翬��
			// ���� �ߺ��� �翬�� �ɼ��� ����. ���� ���и� ������ �Ϸ�.col���� ���� ���̴ϱ� ������ ��󳻸��
			if (col[i] == col[row]) 
				return false;
			if (Math.abs(col[i] - col[row]) == Math.abs(i - row)) // �밢���� ��ġ�ϴ� x�� ���� y�� ���� ������ �밢���� ��ġ�ϴ� �Ŷ� �Ұ���
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(reader.readLine());

		col = new int[15]; // 15�� ���� (0�� �Ⱦ���.)

		for (int i = 1; i <= n; i++) { // i�� ���̴�. ���� ù��° ���� �ַ�� �˻��Ѵ�. ó���� 1���� �˻��Ѵ�.
			col[1] = i; // �̷��ԵǸ� 1�� i�� �̷����̴�..
			dfs(1);
		}

		writer.write(count + "");

		reader.close();
		writer.flush();
		writer.close();
	}

}
