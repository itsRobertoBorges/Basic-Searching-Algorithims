package selectionSort;

public class selectionSort {

	private static void printArray(int[] array) {
		
		for(int i: array) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	private static void swap(int[] array, int left, int right) {
		
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	private static void selectionSort(int[] array) {
		int min;
		
		for(int i = 0; i < array.length - 1; i++) {
			
			min = i;
			
			for(int j = i+1; j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				swap(array, i, min);
			}
		}
	}
	public static void main(String[]args) {
		int [] array = { 12, 6, 34, 30, 0, 1, 3, 199, 123, 2532 };
		System.out.println("Before sorting:");  
		printArray(array);
		
		System.out.println("After sorting:");
		selectionSort(array);
		printArray(array);
		
	}
}
