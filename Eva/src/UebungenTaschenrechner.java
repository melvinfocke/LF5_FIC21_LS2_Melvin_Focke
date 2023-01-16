import java.util.Scanner;

public class UebungenTaschenrechner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. Zahl: ");
		double zahl1 = scan.nextDouble();
		
		System.out.print("2. Zahl: ");
		double zahl2 = scan.nextDouble();
		
		System.out.print("Operationszeichen (+, -, *, /): ");
		char operator = scan.next().charAt(0);
		double ergebnis;
		
		switch (operator) {
		case '+':
			ergebnis = zahl1 + zahl2;
			break;
		case '-':
			ergebnis = zahl1 - zahl2;
			break;
		case '*':
			ergebnis = zahl1 * zahl2;
			break;
		case '/':
			ergebnis = zahl1 / zahl2;
			break;
		default:
			System.out.println("Ungültiger Operator!");
			return;
		}
		System.out.println(zahl1 + " " + operator + " " + zahl2 + " = " + ergebnis);
	}

}
