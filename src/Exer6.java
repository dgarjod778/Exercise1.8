
public class Exer6 {
	{
		String cadena;
		boolean booleano = true;
		int entero = 44;
		char caracter = 'c';
		double decimal = 2.3;

		// Con el método valueOf de los tipos String, saco el valor en cadena del
		// boolean, int, char y double y los concateno en una variable cadena.

		cadena = String.valueOf(booleano) + String.valueOf(caracter) + String.valueOf(decimal) + String.valueOf(entero);

		System.out.println("Cadena resultante-->" + cadena);

	}
}
