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
//	public static int partition(int[] array, int left, int right) { // 구분점을 만드는 메소드
//		int mid = (left + right) / 2; // 원소의 중앙값을 첫 번째 원소와 교환하기 위함
//		swap(array, left, mid); // 중앙 값을 첫 번째 요소로 이동
//
//		int pivot = array[left]; // 첫 번째 인덱스가 pivot이 된다.
//
//		int i = left, j = right;
//
//		while (i < j) { // left < right 즉, 교차하기 전 까지 반복한다.
//			while (pivot < array[j]) { // j는 오른쪽에서 왼쪽으로 피봇보다 작거나 같은 값을 찾는다.
//				j--;
//			}
//
//			while (i < j && pivot >= array[i]) { // i는 왼쪽에서 오른쪽으로 피봇보다 큰 값을 찾는다.
//				i++;
//			}
//			swap(array, i, j); // 찾은 i와 j를 교환
//		}
//		// 반복문을 벗어난 경우는 i와 j가 만난경우
//		// 피봇과 교환
//		array[left] = array[i]; // 어차피 i와 j가 만나기 때문에 i 또는 j를 사용하면 된다.
//		array[i] = pivot; // array[left]값을 담아 둔 pivot을 구분점의 요소에 저장
//		return i; // 구분점이 되는 인덱스를 반환한다.
//	}
//
//	public static void swap(int[] array, int a, int b) { // 단순 swap 메소드
//		int temp = array[b];
//		array[b] = array[a];
//		array[a] = temp;
//	}
//
//	public static void quickSort(int[] array, int left, int right) { // 실질적인 quickSort 재귀호출을 이룬다.
//		if (left >= right) { // 이 경우는 비교할 요소가 한 개일 경우이므로 메소드를 종료한다.
//			return;
//		}
//
//		int pi = partition(array, left, right); // 위의 메소드를 통해서 구한 구분점을 저장
//		quickSort(array, left, pi - 1); // left부터 구분점 전까지 다시 한 번 재귀호출
//		quickSort(array, pi + 1, right); // 구분점 다음부터 right까지 다시 한 번 재귀호출
//	}

//	// 3.
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int partition(int[] a, int start, int end) {
		int value = a[end]; // 기준값
		int i = start - 1; // i는 1구역의 끝지점
		for (int j = start; j <= end - 1; ++j) // j는 3구역의 시작 지점
			if (a[j] < value) // a[j] 값이 1구역에 속하면
				swap(a, ++i, j); // a[j] 값을 1구역의 끝에 추가한다. 1구역 크기 1증가.
		swap(a, i + 1, end); // 기준값인 a[end] 원소와 2구역의 시작 원소를 교환한다.
		return i + 1; // 기준값 위치 리턴
	}

	static void quickSort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int middle = partition(a, start, end); // 배열 나누기
		quickSort(a, start, middle - 1); // 1구역 정렬
		quickSort(a, middle + 1, end); // 2구역 정렬
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		// 1. 2. 3. 모두 동일한 Quick Sort 임
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
