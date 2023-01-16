import java.util.InputMismatchException;
import java.util.Scanner;

public class Testen {

	public static void main(String[] args) {	
		int ganzeZahl = 0;
	
		boolean korrekteEingabe = false;
		while (!korrekteEingabe) {
			try {
				System.out.print("Bitte ganze Zahl eingeben: ");
				Scanner scan = new Scanner(System.in);
				ganzeZahl = scan.nextInt();
				korrekteEingabe = true;
				scan.close();
			} catch (InputMismatchException e) {
				System.out.println("Ungültige Zahl eingegeben!");
			}
		}
		System.out.println("Du hast " + ganzeZahl + " eingegeben.");
	}	
}
