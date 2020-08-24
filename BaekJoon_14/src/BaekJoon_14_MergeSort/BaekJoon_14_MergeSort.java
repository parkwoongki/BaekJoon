package BaekJoon_14_MergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_14_MergeSort {

	static int[] temp; // 작업용 배열

	static void mergeSort(int[] num, int N) {
		temp = new int[N];

		mergeSort(num, 0, N - 1); // 배열 전체를 병합 정렬
	}

	// 병합 정렬(main)
	static void mergeSort(int[] num, int start, int end) {
		// 배열 요소가 2개 이상인 경우
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(num, start, mid); // 앞부분 병합 정렬
			mergeSort(num, mid + 1, end); // 뒷부분 병합 정렬
			merge(num, start, end); // 앞부분과 뒷부분 병합
		}
	}

	// 앞부분과 뒷부분 병합
	static void merge(int[] num, int start, int end) {
		int mid = (start + end) / 2;

		// temp에 num 배열 저장
		for (int i = start; i <= end; i++)
			temp[i] = num[i];

		int part1 = start; // 앞부분 배열의 시작 인덱스
		int part2 = mid + 1; // 뒷부분 배열의 시작 인덱스
		int index = start; // 최종 결과를 오름차순대로 배열에 저장할 인덱스

		// 오름차순으로 정렬하기
		while (part1 <= mid && part2 <= end) {
			// 앞부분 요소가 뒷부분 요소보다 작으면 결과 배열에 앞부분 요소 저장
			if (temp[part1] <= temp[part2])
				num[index++] = temp[part1++];
			// 뒷부분 요소가 더 작으면 결과 배열에 뒷부분 요소 저장
			else
				num[index++] = temp[part2++];
		}

		// 앞부분 배열의 요소가 남았을 경우
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
