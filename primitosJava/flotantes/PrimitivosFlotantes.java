package flotantes;

import java.text.DecimalFormat;

public class PrimitivosFlotantes {

	public static void main(String[] args) {
		
		float numeroFloat = 3.1415F;
		/* float numeroExponente = 2.12E3f; 
		*  2.12 * 10^3 
		*  21.2
		*  212
		*  2120f
		*/
		float numeroExponeteNegativo = 0.00015f; // 0.00015

		float realFloat = 1.5e4f; // multiplicamos 1.5 * 10^4 seria 15000f;
		
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(6);
		
		System.out.println("numeroFloat: " + numeroFloat);
		
		System.out.println("El tipo float corresponde a: " + Float.BYTES + " byte");
		System.out.println("El tipo float corresponde a: " + Float.SIZE + " bites");
		System.out.println("El valor maximo de un float es: " + Float.MAX_VALUE);
		System.out.println("El valor minimo de un float es: " + Float.MIN_VALUE);
		
		System.out.println(df.format(numeroExponeteNegativo));
		
		System.out.printf("%.5f", numeroExponeteNegativo);
		
		
		/*Primitivos Flotantes Double*/
		
		double numeroDouble = 2.031546;
		System.out.println("numeroDouble = " + numeroDouble);
		
		System.out.println("El tipo double corresponde a: " + Double.BYTES + " byte");
		System.out.println("El tipo double corresponde a: " + Double.SIZE + "bites");
		System.out.println("EL valor maximo de un double es: " + Double.MAX_VALUE);
		System.out.println("El valor minimo de un double es: " + Double.MIN_VALUE);
		
	
       //  0.01+0.01+0.01+0.01+0.01+ 0.01 = 0.06
		float peso = 0.01f;
		float suma = peso*6;
		System.out.println(suma);
		
		
		// JAVA 9 variable dinamicas.
		// myVariable = "miguel";


	}

}
