import java.util.Scanner;
public class Haendler {

    public static void main(String[] args) {
        

        // Benutzereingaben lesen
        String artikel = liesString("was möchten Sie bestellen?");
        int anzahl = liesInt("Geben Sie die Anzahl ein:");
        double preis = liesDouble("Geben Sie den Nettopreis ein:");
        double mwst = liesDouble("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
       
        // Verarbeiten
        double nettogesamtpreis = berechneGesamtnettopreis(anzahl, preis);
        double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis, mwst);

        // Ausgeben
        rechungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);
    }
    
    public static String liesString(String text) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println(text);
    	return scan.next();
    }
    
    public static int liesInt(String text) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println(text);
    	return scan.nextInt();
    }
    
    public static double liesDouble(String text) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println(text);
    	return scan.nextDouble();
    }
    
    public static double berechneGesamtnettopreis(int anzahl, double nettopreis) {
        return anzahl * nettopreis;
    }
    
    public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst) {
    	return nettogesamtpreis * (1 + mwst / 100);
    }
    
    public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
    	System.out.println("\tRechnung");
        System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }

}