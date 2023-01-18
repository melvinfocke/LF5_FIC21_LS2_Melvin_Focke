public class ArrayUebung {
	public static void main(String args[]) {
		// 1. Deklaration eines Arrays für ganze Zahlen.
		int[] zahlen;

		// 2. Initialisierung des Arrays mit 100 Elementen.
		zahlen = new int[100];

		// 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + ", ");
		}
		System.out.println();

		// 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = i+1;
		}

		// 5. Geben Sie den Wert an der Stelle 89 des Arrays aus.
		System.out.println(zahlen[89]);

		// 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
		zahlen[49] = 1060;

		// Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2020.
		zahlen[0] = 2020;
		zahlen[zahlen.length - 1] = 2020;
		
		// 7. Erneutes ausgeben des Arrayinhalts.
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + ", ");
		}
		System.out.println();

		// Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println("Index " + i + " - Inhalt: " + zahlen[i]);
		}

		int summe = 0;
		// 8. Berechnung des Durchschnitts aller Arrayelemente
		for (int i = 0; i < zahlen.length; i++) {
			summe += zahlen[i];
		}
		double avg = (double) summe / zahlen.length;
		System.out.println("Durchschnitt: " + avg);

	}
}