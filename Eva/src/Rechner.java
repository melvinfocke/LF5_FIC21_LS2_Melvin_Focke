import java.util.Scanner;

public class Rechner {
	
	public static void main(String[] args) {
		int zahl1 = 0; // Variablen vom Typ Integer und Double werden deklariert und auf 0 gesetzt
		int zahl2 = 0; 
		int summe = 0;
		int differenz = 0;
		int produkt = 0;
		double quotient = 0;
		int modulo = 0;
		
		
		// EINGABE
		Scanner tastatur = new Scanner(System.in); // Variable vom Typ Scanner wird erstellt
		System.out.print("Bitte geben Sie eine ganze Zahl ein: "); // Text wird in Konsole ausgegeben
		zahl1 = tastatur.nextInt(); // Eingabe vom Scanner wird in Variable zahl1 geschrieben
		System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: "); // // Text wird in Konsole ausgegeben
		zahl2 = tastatur.nextInt(); // Eingabe vom Scanner wird in Variable zahl2 geschrieben
		
		// VERARBEITUNG
		summe = zahl1 + zahl2; // zahl1 und zahl2 werden zusammenaddiert und Summe wird in Variable ergebnis geschrieben
		differenz = zahl1 - zahl2;
		produkt = zahl1 * zahl2;
		quotient = (double) zahl1 / zahl2;
		modulo = zahl1 % zahl2;
		
		// AUSGABE
		System.out.println("\nSumme:\t\t" + summe); // Neue Zeile. Text und Wert von Variable ergebnis wird in Konsole ausgegeben
		System.out.println("Differenz:\t" + differenz);
		System.out.println("Produkt:\t" + produkt);
		System.out.println("Quotient:\t" + quotient);
		System.out.println("Rest:\t\t" + modulo);
		tastatur.close(); // Tastatur-Objekt wird geschlossen
	}
}
