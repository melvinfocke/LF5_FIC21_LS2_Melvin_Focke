
public class Suche {

	public static void main(String[] args) {
		int[] zahlenArray1 = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
		suchalgorithmus(zahlenArray1, 2);
		
		int[] zahlenArray2 = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};
		suchalgorithmus(zahlenArray2, 3);

	}
	
	public static void suchalgorithmus(int[] arr, int gesuchterWert) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != gesuchterWert) continue;
			System.out.println("Gefunden!");
			return;
		}
		System.out.println("Nicht gefunden!");
		
	}

}
