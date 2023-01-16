import java.util.Scanner;

public class UebungenRoemischeZahlen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bitte ein römisches Zahlzeichen eingeben: ");
		char eingabe = scan.next().charAt(0);
		
		int ausgabe;
		switch (eingabe) {
		case 'I':
			ausgabe = 1;
			break;
		case 'V':
			ausgabe = 5;
			break;
		case 'X':
			ausgabe = 10;
			break;
		case 'L':
			ausgabe = 50;
			break;
		case 'C':
			ausgabe = 100;
			break;
		case 'D':
			ausgabe = 500;
			break;
		case 'M':
			ausgabe = 1000;
			break;
		default: 
			System.out.println("Falsche Eingabe!");
			return;
		}
		System.out.println(eingabe + " -> " + ausgabe);
	}

}
