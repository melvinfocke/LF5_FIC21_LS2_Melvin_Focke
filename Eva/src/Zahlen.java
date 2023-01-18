
public class Zahlen {

	public static void main(String[] args) {

		int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};
		
		int haeufigsteZahl = 0;
		int haeufigstesVorkommen = 0;
		
		for (int i = 0; i < zahlen.length; i++) {
			int aktuellesVorkommen = 0;
			
			for (int j = 0; j < zahlen.length; j++) {
				if (zahlen[i] == zahlen[j]) aktuellesVorkommen++;
			}
			if (aktuellesVorkommen > haeufigstesVorkommen) {
				haeufigsteZahl = zahlen[i];
				haeufigstesVorkommen = aktuellesVorkommen;
			}
		}
		System.out.println("Häufigste Zahl: " + haeufigsteZahl + " (" + haeufigstesVorkommen + " Vorkommen)");
	}

}
