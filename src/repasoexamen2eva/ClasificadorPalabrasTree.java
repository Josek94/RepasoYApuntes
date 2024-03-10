package repasoexamen2eva;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ClasificadorPalabrasTree {

	public static void main(String[] args) {
		Set<String> SetDeTipoTree = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hola amigos!");
		String texto = scanner.nextLine();
		
		texto = texto.toLowerCase();
		texto = texto.replaceAll("\\p{Punct}", "");
		texto = texto.replaceAll("[¡¿]", "");
		
		for(String recorrer : texto.split(" ")) {
			SetDeTipoTree.add(recorrer);
		}
		
		SetDeTipoTree.forEach(s -> System.out.println(s));
		
		
	}
	
	
}
