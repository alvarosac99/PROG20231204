import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("^([\\p{Lu}\\p{Ll}\\s]+)–\\s(\\d{1,2});\\s(\\d{1,2});\\s(\\d{1,2})$");
		System.out.println("Cuantos alumnos son?");
		
		int lineas = sc.nextInt();
		String[] nombres = new String[lineas];
		Double[][] notas = new Double[lineas][3];
		
		
		for (int i = 0; i < lineas; i++) {
			System.out.println("Nombre y apellidos - nota1; nota2; nota3");
			String usuario = sc.nextLine();
			Matcher m = p.matcher(usuario);
			
			if (m.matches()) {
				nombres[i] = m.group(1);
				notas [i][0] = Double.parseDouble(m.group(3));
				notas [i][1] = Double.parseDouble(m.group(4));
				notas [i][2] = Double.parseDouble(m.group(5));	
			} else {
				System.out.println("Has introducido mal los datos, vuelva a intentarlo");
				i--;
			}
			
			
			
			
		}
		
		
		System.out.println(Arrays.toString(nombres));
	}
}
