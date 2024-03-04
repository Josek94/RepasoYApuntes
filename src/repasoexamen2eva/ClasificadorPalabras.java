package repasoexamen2eva;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClasificadorPalabras {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un nuevo texto: ");
		String texto = scanner.nextLine();
		
		
		
		Set<String> cadenaDeCaracteres = new HashSet<>();
		
		for(String recorrer : texto.split(" ")) {
			cadenaDeCaracteres.add(recorrer);
			
		}
		cadenaDeCaracteres.forEach(s -> System.out.println(s));
	}
}
