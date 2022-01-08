package linearSearch;

public class linearSearch {


	private static void linearSearch(int[] array, int value) {
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				System.out.println("Found value: " + array[i] + ", located in index: " + i);
				System.out.println("This algorithim has ended.");
				break;
		}
			if(array[i] != value) {
				System.out.println(+ value + " Is not located in index: " + i + " index: " + i + " is holding: " + array[i] + ".");
			}
	} 
}
	public static void main(String[]args) {
		int[] array = { 10, 24, 43, 6, 35, 5, 10, 11, 124, 543 };
		linearSearch(array, 5);
	}
}
