
public class Exer2 {
	public static void main(String[] args) {
		String s1 = "hola";
		String s2 = "Hola";
		String s3 = "adios";
		String s4;
		boolean a;
		int numero;
		String union;
		// 4.-
		numero = s1.compareTo(s2);
		System.out.println(numero);
		// 5.-
		numero = s1.compareToIgnoreCase(s2);
		System.out.println(numero);
		// 6.-
		union = s1.concat(s2);
		System.out.println(union);
		// 7.-
		a = s1.endsWith("a");
		System.out.println(a);
		// 8.-
		a = s1.equals(s2);
		System.out.println(a);
		// a=s1.equals(s2)&(s3);
		// System.out.println(a);
		// 9.-
		a = s1.equalsIgnoreCase(s2);
		System.out.println(a);
		// 10.-
		numero = s1.indexOf("a");
		System.out.println(numero);
		// 11.-
		numero = s1.indexOf(1, 2);
		System.out.println(numero);
		// 12.-
		numero = s1.lastIndexOf(s3);
		System.out.println(numero);
		// 13.-
		numero = s1.lastIndexOf(s3, 0);
		System.out.println(numero);
		// 19.-
		s4 = s1.replace(h, b);
		System.out.println(s4);

	}
}
