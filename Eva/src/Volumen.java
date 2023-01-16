
public class Volumen {

	public static void main(String[] args) {
		double volumen1 = volumenWuerfel(3.5);
		System.out.println(volumen1);
		
		double volumen2 = volumenWuerfel(12);
		System.out.println(volumen2);
	}
	
	public static double volumenWuerfel(double a) {
		return a * a * a;
	}

}
