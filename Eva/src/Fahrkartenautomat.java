import java.util.Scanner;

class Fahrkartenautomat {
	static int gesamtzahlTickets = 0;
	
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);
		double zuZahlenderBetrag = 0.00;
		double eingezahlterGesamtbetrag;
		
		begruessung();
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		fahrkartenAusgeben();
		rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
		
		tastatur.close();
	}
	
	public static void begruessung() {
		System.out.println("Fahrkartenbestellvorgang:\n=========================\n");
		System.out.println("Herzlich Willkommen!\n");
	}
	
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		String[] fahrkartenBezeichnungen = {"Einzelfahrschein AB", "Einzelfahrschein BC", "Einzelfahrschein ABC", "Kurzstrecke AB", "Tageskarte AB", "Tageskarte BC", "Tageskarte ABC", "4-Fahrten-Karte AB", "4-Fahrten-Karte BC", "4-Fahrten-Karte ABC", "Kleingruppen-Tageskarte AB", "Kleingruppen-Tageskarte BC", "Kleingruppen-Tageskarte ABC"};
		double[] fahrkartenPreise = {3.00, 3.50, 3.80, 2.00, 8.60, 9.20, 10.00, 9.40, 12.60, 13.80, 25.50, 26.00, 26.50};
		
		double ticketpreis = 0.00;
		int tickettyp;
		int anzahlTickets = 0;
		double zuZahlenderBetrag = 0;
		boolean bezahlen = false;
		while (true) {
			
			for (int i = 0; i < fahrkartenBezeichnungen.length; i++) {
				System.out.printf("%s [%.2f] (%d)\n", fahrkartenBezeichnungen[i], fahrkartenPreise[i], i + 1);
			}
			System.out.println("Bezahlen (0)\n");
			
//			// Ticket auswählen
//			System.out.println("Kurzstrecke AB [2,00 EUR] (1)\n" + 
//					"Einzelfahrschein AB [3,00 EUR] (2)\n" + 
//					"Tageskarte AB [8,80 EUR] (3)\n" + 
//					"4-Fahrten-Karte AB [9,40 EUR] (4)\n" + 
//					"Bezahlen (9)\n");
			
			while(true) {
				System.out.print("Ihre Wahl: ");
				tickettyp = tastatur.nextInt();
				
				if (tickettyp < 0 || tickettyp > fahrkartenBezeichnungen.length) {
					System.out.println(" >> Falsche Eingabe <<");
					continue;
				}
				
				if (tickettyp == 0) {
					bezahlen = true;
					break;
				}
				ticketpreis = fahrkartenPreise[tickettyp - 1];
				break;
			}
			
			if (bezahlen) break;
			
			while (!bezahlen) {
				System.out.print("Anzahl der Tickets: ");
				anzahlTickets = tastatur.nextInt();
				if (anzahlTickets >= 1 && anzahlTickets <= 10) break;
				
				System.out.println(" >> Wählen Sie bitte eine Ticketanzahl von 1 bis 10 aus. <<");
			}
			
			gesamtzahlTickets += anzahlTickets;
			zuZahlenderBetrag += ticketpreis * anzahlTickets;
			System.out.printf("\nZwischensumme: %.2f EUR\n\n", zuZahlenderBetrag);
		}
		
		System.out.println();
		return zuZahlenderBetrag;
	}
	
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double eingezahlterGesamtbetrag = 0.0;
		double nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f EUR\n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
			double eingeworfeneMuenze = tastatur.nextDouble();
			
			if (eingeworfeneMuenze != 0.05 && eingeworfeneMuenze != 0.10 && eingeworfeneMuenze != 0.20 && eingeworfeneMuenze != 0.50 
					&& eingeworfeneMuenze != 1.00 && eingeworfeneMuenze != 2.00 && eingeworfeneMuenze != 5.00 
					&& eingeworfeneMuenze != 10.00 && eingeworfeneMuenze != 20.00) {
				System.out.println(">> Kein gültiges Zahlungsmittel");
			} else {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;	
			}
		}
		return eingezahlterGesamtbetrag;
	}
	
	public static void fahrkartenAusgeben() {
		System.out.printf("\n%d %s ausgegeben\n", gesamtzahlTickets, gesamtzahlTickets == 1 ? "Fahrschein wird" : "Fahrscheine werden");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}

	public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {
		int rueckgabebetrag = (int) Math.round(eingezahlterGesamtbetrag * 100) - (int) Math.round(zuZahlenderBetrag * 100); // Rückgabebetrag in Cent
		if (rueckgabebetrag > 0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rueckgabebetrag / 100.0);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 200);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 100);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 50);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 20);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 10);
			rueckgabebetrag = muenzRueckgabe(rueckgabebetrag, 5);
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
	}
	
	public static int muenzRueckgabe(int rueckgabebetrag, int muenzwert) {
		while (rueckgabebetrag >= muenzwert) { // X-Cent-Münzen
			System.out.println(muenzwert >= 100 ? muenzwert / 100 + " Euro" : muenzwert + " Cent");
			rueckgabebetrag = rueckgabebetrag - muenzwert;
		}
		return rueckgabebetrag;
	}
}