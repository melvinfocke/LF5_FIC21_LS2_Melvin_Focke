import java.util.Scanner;

public class UebungenOhmschesGesetz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double zahl1, zahl2;
		
		System.out.print("Welche Größe soll berechnet werden? (R, U, I): ");
		char groesse = scan.next().charAt(0);
		
		switch (groesse) {
		case 'R':
			System.out.print("Bitte U in Volt eingeben: ");
			zahl1 = scan.nextDouble();
			
			System.out.print("Bitte I in Ampere eingeben: ");
			zahl2 = scan.nextDouble();
			
			System.out.printf("R = %.2f Ω", zahl1 / zahl2);
			break;
		case 'U':
			System.out.print("Bitte R in Ohm eingeben: ");
			zahl1 = scan.nextDouble();
			
			System.out.print("Bitte I in Ampere eingeben: ");
			zahl2 = scan.nextDouble();
			
			System.out.printf("U = %.2f V", zahl1 * zahl2);
			break;
		case 'I':
			System.out.print("Bitte R in Ohm eingeben: ");
			zahl1 = scan.nextDouble();
			
			System.out.print("Bitte U in Volt eingeben: ");
			zahl2 = scan.nextDouble();
			
			System.out.printf("I = %.2f I", zahl2 / zahl1);
			break;
		default:
			System.out.println("Falsche Eingabe!");	
		}
		
	}

}
