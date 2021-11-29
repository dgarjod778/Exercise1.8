
public class Exer3 {
	public static void main(String[] args) {

		new Ejercicio_3_Character().ejercicio3();

	}

	public void ejercicio3() {

		char primitive = 'c';
		Character character = 'c';
		
		System.out.println(character.charValue());
		System.out.println(Character.compare(primitive, 'f'));

		System.out.println(character.equals('f'));

		System.out.println(Character.isDigit(primitive));

		System.out.println(Character.isLetter(primitive));

		System.out.println(Character.isLowerCase(primitive));

		System.out.println(Character.isSpaceChar(primitive));

		System.out.println(Character.isUpperCase(primitive));


		System.out.println(Character.toLowerCase(primitive));


		System.out.println(Character.toUpperCase(primitive));


		System.out.println(Character.valueOf(primitive));


	}

}
