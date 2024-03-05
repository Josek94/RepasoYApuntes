package repasoexamen2eva;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ClasificadorPalabras {
	public static void main(String[] args) {
		Set<String> cadenaDeCaracteres = new LinkedHashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un nuevo texto: ");
		String texto = scanner.nextLine();
		
		
		texto = texto.replaceAll("\\p{Punct}", "");
		texto = texto.replaceAll("[¿¡]", "");
		
		
		for(String recorrer : texto.split(" ")) {
			cadenaDeCaracteres.add(recorrer);
			
		}
		cadenaDeCaracteres.forEach(s -> System.out.println(s));
	}
}
