
public class Exer5 {
	public static void main(String[] args) {

	}

	public void ejercicio5() {

		Double double1 = 32.7;
		Double double2 = 27.9, double3 = 41.2;
		Double double4 = 3.4;

		System.out.println(Double.compare(34.5, 61.7));


		System.out.println(double3.compareTo(double3));

		System.out.println(double3.doubleValue());

		System.out.println(double3.equals(double3));

		System.out.println(double4.floatValue());

		System.out.println(double1.intValue());

		System.out.println(double3.isInfinite());

		System.out.println(Double.isInfinite(34.5));

		System.out.println(double3.isNaN());

		System.out.println(Double.isInfinite(-1));

		System.out.println(Double.max(23.4, 21.7));

		System.out.println(Double.min(45.3, 45.4));

		System.out.println(Double.parseDouble("567"));

		System.out.println(Double.sum(34.0, 21.9));

		System.out.println(Double.valueOf(double2));

		System.out.println(Double.valueOf("321.56"));

	}
}
