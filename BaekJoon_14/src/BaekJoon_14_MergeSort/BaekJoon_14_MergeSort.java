package BaekJoon_14_MergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_14_MergeSort {

	static int[] temp; // �۾��� �迭

	static void mergeSort(int[] num, int N) {
		temp = new int[N];

		mergeSort(num, 0, N - 1); // �迭 ��ü�� ���� ����
	}

	// ���� ����(main)
	static void mergeSort(int[] num, int start, int end) {
		// �迭 ��Ұ� 2�� �̻��� ���
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(num, start, mid); // �պκ� ���� ����
			mergeSort(num, mid + 1, end); // �޺κ� ���� ����
			merge(num, start, end); // �պκа� �޺κ� ����
		}
	}

	// �պκа� �޺κ� ����
	static void merge(int[] num, int start, int end) {
		int mid = (start + end) / 2;

		// temp�� num �迭 ����
		for (int i = start; i <= end; i++)
			temp[i] = num[i];

		int part1 = start; // �պκ� �迭�� ���� �ε���
		int part2 = mid + 1; // �޺κ� �迭�� ���� �ε���
		int index = start; // ���� ����� ����������� �迭�� ������ �ε���

		// ������������ �����ϱ�
		while (part1 <= mid && part2 <= end) {
			// �պκ� ��Ұ� �޺κ� ��Һ��� ������ ��� �迭�� �պκ� ��� ����
			if (temp[part1] <= temp[part2])
				num[index++] = temp[part1++];
			// �޺κ� ��Ұ� �� ������ ��� �迭�� �޺κ� ��� ����
			else
				num[index++] = temp[part2++];
		}

		// �պκ� �迭�� ��Ұ� ������ ���
		for (int i = 0; i <= mid - part1; i++)
			num[index + i] = temp[part1 + i];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		mergeSort(arr, n);

		StringBuffer sb = new StringBuffer();
		for (int a : arr) {
			sb.append(a).append("\n");
		}

		writer.write(sb.toString());
		writer.flush();
		writer.close();
		reader.close();
	}

}
