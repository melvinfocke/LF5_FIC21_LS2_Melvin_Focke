
public class Konfigurationstest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int cent;
		cent = 70;
		cent = 80;
		double maximum = 95.50;
		
		boolean bool = true;
		short kleineZahl = -1000;
		float kommaZahl = 1.255F;
		char zeichen = '#';
		byte sehrKleineZahl = 8;
		long grosseZahl = 2147483648L;
		
		String satz = "Ich liebe Hunde.";
		final short CHECK_NR = 8765;
		
		/*
		 * Die Verwendung von Datentypen ist sinnvoll, da:
		 * - dadurch Speicherplatz gespart wird
		 * - Fehler direkt in der IDE erkannt werden können
		 */
		
		int ergebnis = 4 + 8 * 9 - 1;
		System.out.println(ergebnis);
		
		int zaehler = 1;
		zaehler++;
		System.out.println(zaehler);
		
		System.out.println(22 / 6);
		
		int schalter = 10;
		System.out.println(schalter > 7 && schalter < 12);
		System.out.println(schalter != 10 || schalter == 12);
		
		System.out.println("Meine Oma " + "fährt im " + "Hühnerstall Motorrad.");
	}

}
