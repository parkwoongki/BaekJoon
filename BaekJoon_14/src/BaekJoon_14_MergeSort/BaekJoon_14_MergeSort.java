package BaekJoon_14_MergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon_14_MergeSort {
	// a �迭���� start ���� end ������ ���� �����Ѵ�.
	static void mergeSort(int[] a, int start, int end) {
		if (start == end)
			return; // ������ �κ��� ���̰� 1 �̸� �׳� �����Ѵ�.
		int middle = (start + end) / 2;

		// start�� end ���� �߰������� ����Ѵ�.
		mergeSort(a, start, middle); // �պκ��� �����ϱ� ���� ��� ȣ��
		mergeSort(a, middle + 1, end); // �޺κ��� �����ϱ� ���� ��� ȣ��
		merge(a, start, middle, end); // �պκа� �޺κ� ����
	} // a �迭���� �պκ�(start ~ middle)�� �޺κ�(middle+1 ~ end)�� �����Ѵ�.

	static void merge(int[] a, int start, int middle, int end) {
		int length = end - start + 1; // ������ �κ��� ���̸� ���Ѵ�.
		int[] temp = new int[length]; // ���� ����� ������ �ӽ� �迭�� �����Ѵ�.

		int i = 0; // �ӽ� �迭�� ���� �ε��� ����
		int index1 = start; // �պκ�(start ~ middle)�� ���� �ε��� ����
		int index2 = middle + 1; // �޺κ�(middle+1 ~ end)�� ���� �ε��� ����
		while (index1 <= middle && index2 <= end) { // ������ ���� �պκа� �޺κп� �� �� ���� �ִٸ�
			if (a[index1] < a[index2]) // �պκа� �޺κ��� ������ ���� ���Ͽ�
				temp[i++] = a[index1++]; // �� ���� ���� �ӽ� �迭�� ���� ���� else
			temp[i++] = a[index2++];
		}
		while (index1 <= middle) // �պκ� �迭�� �����ִ� ���� �ӽ� �迭�� �ִ´�.
			temp[i++] = a[index1++];
		while (index2 <= end) // �ںκ� �迭�� �����ִ� ���� �ӽ� �迭�� �ִ´�.
			temp[i++] = a[index2++];
		for (i = 0; i < temp.length; ++i) // �ӽ� �迭�� ������ a �迭�� start ��ġ�� �����Ѵ�.
			a[start + i] = temp[i];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		mergeSort(a, 0, a.length - 1);

		StringBuffer sb = new StringBuffer();
		for (int i : a) {
			sb.append(i).append("\n");
		}

		writer.write(sb.toString());
		writer.flush();
		writer.close();
		reader.close();
	}

}
