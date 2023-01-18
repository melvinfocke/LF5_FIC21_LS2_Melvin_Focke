
public class Wetterstation {

	public static void main(String[] args) {
		double[] wetterdaten = { -15.55, -2.55, -11.44, -8.6, -14.4, -5.17, 1.48, -3.47, 2.00, 2.14, 4.05, 7.45, 3.25, 5.04, 11.4, 7.67, 8.64, 13.28, 6.87, 15.54, 12.45, 16.55, 20.42, 22.38, 19.58, 18.85, 23.84, 24.42, 25.54, 28.35, 30.16, 32.44, 26.55, 22.13, 16.64, 13.33, 16.45, 17.34, 15.33, 11.13, 15.16, 11.44, 6.55, 2.13, 6.64, 3.33, 6.45, -1.34, 5.33, -11.15 };
		double minimum = Double.MAX_VALUE;
		double maximum = Double.MIN_VALUE;
		double groessterUmschwung = 0;
		
		double summe = 0;
		for (int i = 0; i < wetterdaten.length; i++) {
			double wert = wetterdaten[i];
			summe += wert;
			if (wert < minimum) minimum = wert;
			if (wert > maximum) maximum = wert;
			
			if (i > 0) {
				double tempUmschwung = Math.abs(wert - wetterdaten[i - 1]);
				if (tempUmschwung > groessterUmschwung) groessterUmschwung = tempUmschwung;
			}
			
		}
		
		System.out.println("Anzahl der Daten: " + wetterdaten.length);
		System.out.printf("Durchschnittstemperatur: %.2f\n", summe / wetterdaten.length);
		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
		System.out.println("Größter Umschwung: " + groessterUmschwung);
	}

}
