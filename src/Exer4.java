
public class Exer4 {
	public static void main(String[] args) {

		new Ejercicio_4_Integer().ejercicio4();

	}

	public void ejercicio4() {

		Integer integer = 100;
		int entero = 35;
		Integer integer2 = 24;
		Integer integer3 = 24, integer4 = 45;
		String cadena = "5674";

		System.out.println(integer.byteValue());

		System.out.println(Integer.compare(entero, 9));

		System.out.println(integer3.compareTo(integer4));

		System.out.println(integer2.doubleValue());

		System.out.println(integer3.equals(integer4));

		System.out.println(integer3.intValue());

		System.out.println(Integer.max(entero, 101));

		System.out.println(Integer.min(entero, 87));

		System.out.println(Integer.parseInt(cadena));

		System.out.println(Integer.sum(entero, 34));

		System.out.println(Integer.valueOf(56));

		System.out.println(Integer.valueOf(integer3));
	}

}
