import java.util.Scanner;

public class Spielbank {

	public static void main(String[] args) {
		int summe = 0;
		
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Anzahl an 5 Euro Chips: ");
		summe += 5 * tastatur.nextInt();
		
		System.out.print("Anzahl an 10 Euro Chips: ");
		summe += 10 * tastatur.nextInt();
		
		System.out.print("Anzahl an 20 Euro Chips: ");
		summe += 20 * tastatur.nextInt();
		
		System.out.print("Anzahl an 50 Euro Chips: ");
		summe += 50 * tastatur.nextInt();
		
		System.out.print("Anzahl an 100 Euro Chips: ");
		summe += 100 * tastatur.nextInt();
		
		System.out.println("Ihr Auszahlungsbetrag beträgt: " + summe + " Euro.");
		tastatur.close();
	}

}
