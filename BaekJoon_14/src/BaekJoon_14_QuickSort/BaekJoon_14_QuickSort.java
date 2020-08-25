package BaekJoon_14_QuickSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_14_QuickSort {

//	// 1.
//	static void quickSort(int[] nums, int left, int right) {
//		int pl = left;
//		int pr = right;
//		int x = nums[(pl + pr) / 2];
//
//		do {
//			while (nums[pl] < x)
//				pl++;
//			while (nums[pr] > x)
//				pr--;
//			if (pl <= pr)
//				swap(nums, pl++, pr--);
//
//		} while (pl <= pr);
//		if (left < pr)
//			quickSort(nums, left, pr);
//		if (right > pl)
//			quickSort(nums, pl, right);
//	}
//
//	private static void swap(int[] a, int i, int j) {
//		int tmp = a[i];
//		a[i] = a[j];
//		a[j] = tmp;
//	}

//	// 2. 
//	public static int partition(int[] array, int left, int right) { // �������� ����� �޼ҵ�
//		int mid = (left + right) / 2; // ������ �߾Ӱ��� ù ��° ���ҿ� ��ȯ�ϱ� ����
//		swap(array, left, mid); // �߾� ���� ù ��° ��ҷ� �̵�
//
//		int pivot = array[left]; // ù ��° �ε����� pivot�� �ȴ�.
//
//		int i = left, j = right;
//
//		while (i < j) { // left < right ��, �����ϱ� �� ���� �ݺ��Ѵ�.
//			while (pivot < array[j]) { // j�� �����ʿ��� �������� �Ǻ����� �۰ų� ���� ���� ã�´�.
//				j--;
//			}
//
//			while (i < j && pivot >= array[i]) { // i�� ���ʿ��� ���������� �Ǻ����� ū ���� ã�´�.
//				i++;
//			}
//			swap(array, i, j); // ã�� i�� j�� ��ȯ
//		}
//		// �ݺ����� ��� ���� i�� j�� �������
//		// �Ǻ��� ��ȯ
//		array[left] = array[i]; // ������ i�� j�� ������ ������ i �Ǵ� j�� ����ϸ� �ȴ�.
//		array[i] = pivot; // array[left]���� ��� �� pivot�� �������� ��ҿ� ����
//		return i; // �������� �Ǵ� �ε����� ��ȯ�Ѵ�.
//	}
//
//	public static void swap(int[] array, int a, int b) { // �ܼ� swap �޼ҵ�
//		int temp = array[b];
//		array[b] = array[a];
//		array[a] = temp;
//	}
//
//	public static void quickSort(int[] array, int left, int right) { // �������� quickSort ���ȣ���� �̷��.
//		if (left >= right) { // �� ���� ���� ��Ұ� �� ���� ����̹Ƿ� �޼ҵ带 �����Ѵ�.
//			return;
//		}
//
//		int pi = partition(array, left, right); // ���� �޼ҵ带 ���ؼ� ���� �������� ����
//		quickSort(array, left, pi - 1); // left���� ������ ������ �ٽ� �� �� ���ȣ��
//		quickSort(array, pi + 1, right); // ������ �������� right���� �ٽ� �� �� ���ȣ��
//	}

//	// 3.
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int partition(int[] a, int start, int end) {
		int value = a[end]; // ���ذ�
		int i = start - 1; // i�� 1������ ������
		for (int j = start; j <= end - 1; ++j) // j�� 3������ ���� ����
			if (a[j] < value) // a[j] ���� 1������ ���ϸ�
				swap(a, ++i, j); // a[j] ���� 1������ ���� �߰��Ѵ�. 1���� ũ�� 1����.
		swap(a, i + 1, end); // ���ذ��� a[end] ���ҿ� 2������ ���� ���Ҹ� ��ȯ�Ѵ�.
		return i + 1; // ���ذ� ��ġ ����
	}

	static void quickSort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int middle = partition(a, start, end); // �迭 ������
		quickSort(a, start, middle - 1); // 1���� ����
		quickSort(a, middle + 1, end); // 2���� ����
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		// 1. 2. 3. ��� ������ Quick Sort ��
		quickSort(a, 0, a.length - 1);

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
