package repasoexamen2eva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorFrecuenciaLetras {
	
	public static Map<Character, Integer> cuentaLetrasDelTexto(String texto) {
		Map<Character, Integer> listaDeLetras = new HashMap<>();
		texto = texto.toUpperCase();
		texto = texto.toLowerCase();
		texto = texto.replaceAll("\\p{Punct}", "");
		texto = texto.replaceAll("[¡¿]", "");
		texto = texto.replaceAll(" ", "");
		char[] arrayDeChar = texto.toCharArray();
		
		for(char recorrer : arrayDeChar) {
			
			listaDeLetras.compute(recorrer, (key, valor) -> valor == null? 1 : valor+1);
			
		}
		
		return listaDeLetras;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Character, Integer> listaDeLetras = new HashMap<>();
		
		System.out.print("Ingresa un texto: ");
		String texto = scanner.nextLine();
		
		listaDeLetras = cuentaLetrasDelTexto(texto);
		System.out.println(listaDeLetras);
		
	}
	
	
}
