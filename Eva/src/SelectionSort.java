public class SelectionSort {

	public static void main(String[] args) {
		int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
		
		for (int i = 0; i < liste.length - 1; i++) {
			int minIndex = getMinIndex(liste, i);
			int temp = liste[minIndex];
			liste[minIndex] = liste[i];
			liste[i] = temp;
		}
		
		for (int i = 0; i < liste.length; i++) {
			System.out.print(liste[i] + ", ");
		}
	}
	
	public static int getMinIndex(int[] arr, int startIndex) {
		int minIndex = arr.length - 1;
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) minIndex = i;	
		}
		return minIndex;
	}
}
