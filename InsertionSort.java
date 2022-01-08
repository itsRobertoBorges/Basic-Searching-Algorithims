package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while((j > 0) && (arr[j - 1] > arr[j])) {
				int tmp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = tmp;
				j--;
			}
		}
		return arr;
	}
	
	public static void main(String args[]) {
		int arr[] = new int[] { 2, 6, 5, 1, 3, 4};
		arr = insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}

