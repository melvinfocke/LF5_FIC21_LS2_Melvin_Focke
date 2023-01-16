/* 
 * Aufgabe: Recherechieren Sie im Internet!
 * Sie dürfen nicht die Namen der Variablen verändern!
 * Vergessen Sie nicht den richtigen Datentyp (möglichst kleine Datentypen auswählen)
 */

public class WeltDerZahlen {

	public static void main(String[] args) {

		// Wie viele Einwohner hat Berlin?
		int bewohnerBerlin = 3677472;

		// Wann wurde der erste Computer gebaut?
		short ersterComputer = 1941;

		// Wieviele Planeten hat unser Sonnesystem?
		byte anzahlPlaneten = 8;

		// Wieviele Sonnen sind in der Milchstraße?
		short sonnenMilchstrasse = 150;

		// Wie viel wiegt das schwerste Tier der Welt(kg)?
		int schwerstesTier = 150000;

		// Wie groß ist das kleinste Land der Erde?
		float flaecheKleinsteLand = 0.44F;

		// Wieviel km2 der Erde sind mit Wasser bedeckt?
		short wasser = 361; // sonst int bis 2.1 mrd

		// An wieviel Tagen im Jahr regenet es durchschnittlich in Waialeale auf Hawaii?
		short regen = 335;

		// Wieviele Menschen leben auf der Erde?
		long einwohnerErde = 7753000000L;

		// Wie alt bist du? Wie viele Tage sind das?
		int alterTage = 7300;
		
		System.out.println("Bewohner von Berlin: " + bewohnerBerlin);
		System.out.println("Erste Computer gebaut: " + ersterComputer);
		System.out.println("Anzahl an Planeten: " + anzahlPlaneten);
		System.out.println("Sonnen in der Milchstraße: " + sonnenMilchstrasse + " Milliarden");
		System.out.println("Schwerstes Tier: " + schwerstesTier);
		System.out.println("Fläche kleinste Land (km²): " + flaecheKleinsteLand);
		System.out.println("Wasser der Erde (km²): " + wasser + " Millionen");
		System.out.println("Regen in Waialeale (Tagen): " + regen);
		System.out.println("Einwoher auf der Erde: " + einwohnerErde + " Millionen");
		System.out.println("Alter in  Tagen: " + alterTage);

	}
}