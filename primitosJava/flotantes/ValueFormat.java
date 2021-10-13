package flotantes;

import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ValueFormat {

	public static void main(String[] args) {
	
		float numeroExponenteNegativo = 0.00015f;
		
		// Instancia de decimalformatsymbols para trabajar con "."
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
		simbolos.setDecimalSeparator('.');
		
		// Creando una instancia de decimal format 
		DecimalFormat df = new DecimalFormat("####.#####", simbolos);
		
		System.out.println("Sin formato");
		System.out.println(numeroExponenteNegativo);
		
		// Con printf
		System.out.println("Con printf dandole formato");
	    System.out.printf(Locale.ROOT, "%.5f\n",numeroExponenteNegativo);
	    
	    
	    // Con decimal format
	    System.out.println("Con Decimal format");
	    System.out.println(df.format(numeroExponenteNegativo));

	}

}
