package booleanos;

public class PrimitivosBoolean {

	public static void main(String[] args) {
		
		boolean datoLogico = true;
		System.out.println("datoLogico" + datoLogico);
		
		/*
		 * Las variables de tipo logico (boolean) nos sirven para el flujo de control
		 * */
		// < >
		boolean expresion = 10 != 9;
		boolean expresionMayor = 10 < 5;
		Boolean expresionWrapper = true;
	
		
		System.out.println("el valor de expresion: " + expresion);
		System.out.println("el valor de expresionMayor: " + expresionMayor);
		
		System.out.println( expresion != expresionMayor);
		
		if(expresionMayor) {
			// cuando es true
			// System.out.println("Es distinto");
			System.out.println(" En la parte True");
		} else {
			// cuando es false
			// System.out.println("Es igual");
			System.out.println("En la parte false");
		}

	}

}
