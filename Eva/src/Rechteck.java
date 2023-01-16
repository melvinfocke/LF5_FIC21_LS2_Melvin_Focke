import java.util.Scanner;

public class Rechteck {
	public static void main(String[] args) {
		int seiteA = 0;
		int seiteB = 0;
		int umfang = 0;
		int flaeche = 0;
		
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Seite A (in cm): ");
		seiteA = tastatur.nextInt();
		
		System.out.print("Seite B (in cm): ");
		seiteB = tastatur.nextInt();
		
		umfang = 2 * (seiteA + seiteB);
		flaeche = seiteA * seiteB;
		
		System.out.println("Umfang = " + umfang + " cm");
		System.out.println("Fläche = " + flaeche + " cm²");
		
		tastatur.close();
	}
}
