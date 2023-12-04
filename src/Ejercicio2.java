//En una clase llamada Ejercicio2 pon a prueba el método anterior pasándole 
//palabras extraídas de líneas leídas por teclado, entendiendo por palabra 
//cualquier secuencia de caracteres que no contenta espacios en blanco.
//El usuario podrá introducir tantas líneas como quiera hasta finalizar el programa pulsando ctrl+z.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(">");
			String usuario = sc.nextLine();
			String[] palabras = usuario.split("\\s+");
			System.out.println(Arrays.toString(palabras));
			for (int i = 0; i < palabras.length; i++)
			System.out.println(Ejercicio1.asteriscos(palabras[i])); 
		}
	}

}
