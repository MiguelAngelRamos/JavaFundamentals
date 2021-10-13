package caracteres;

public class Caracteres {

	public static void main(String[] args) {
		
		char caracter = 'M';
		char caracterNumero = '7'; // 0-9
		
		char caracterUnicode = '\u0040'; // @ U+0040
		char caracterDecimal = 64;
		System.out.println(caracterUnicode);
		System.out.println(caracterDecimal);
		
		// comparacion
		System.out.println(caracterDecimal == caracterUnicode);
		
		// Longitud de un caracter
		System.out.println("Char corresponde en byte = " + Character.BYTES);
		System.out.println("Char corresponde en bites = " + Character.SIZE);

	}

}
