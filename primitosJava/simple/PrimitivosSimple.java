package simple;

public class PrimitivosSimple {

	public static void main(String[] args) {
		
		byte numeroByte = 127;
		System.out.println("numeroByte: " + numeroByte);
		
		System.out.println("El tipo byte corresponde a: " + Byte.BYTES + " byte");
		System.out.println("El tipo byte corresponde a: " + Byte.SIZE + " bites");
		System.out.println("El valor maximo de un byte: " + Byte.MAX_VALUE);
		System.out.println("El valor minimo de un byte es: " + Byte.MIN_VALUE);
		
		short numeroShort = 32767;
		System.out.println("numeroShort: " + numeroShort);
		
		System.out.println("El tipo short corresponde a: " + Short.BYTES + " byte");
		System.out.println("El tipo short corresponde a: " + Short.SIZE + " bites");
		System.out.println("El valor maximo de short es: " + Short.MAX_VALUE);
		System.out.println("El valor minimo de un short es: " + Short.MIN_VALUE);
		
		int numeroInt = 32000;
		System.out.println("numeroInt: " + numeroInt);
		
		System.out.println("El tipo int corresponde a: " + Integer.BYTES + " byte");
		System.out.println("El tipo int corresponde a: " + Integer.SIZE + " bites");
		System.out.println("El valor maximo de un int es: " + Integer.MAX_VALUE);
		System.out.println("El valor minimo de un int es: " + Integer.MIN_VALUE);
		
		long numeroLong = 9223372036854775807L;
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("El tipo long corresponde a: " + Long.BYTES + " byte");
		System.out.println("El tipo long corresponde a: " + Long.SIZE + " bites");
		System.out.println("El valor maximo de un long es: " + Long.MAX_VALUE);
		System.out.println("El valor minimo de un long es: " + Long.MIN_VALUE);

	}

}
