////Define en una clase llamada Ejercicio1 un método estático que acepte un String y,
// sin usar sentencias repetitivas,retorne otro String como resultado de sustituir en
// el primero todos los caracteres por asteriscos,excepto el primero y el último.

public class Ejercicio1 {

	static String asteriscos(String usuario) {
		String stringModificado;
		char caracter0 = usuario.charAt(0);
		char caracter1 = usuario.charAt(usuario.length() - 1);

		stringModificado = (caracter0 + "*".repeat(usuario.length() - 2) + caracter1);
		return stringModificado;
	}

}
