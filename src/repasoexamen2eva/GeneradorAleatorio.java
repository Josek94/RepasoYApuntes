package repasoexamen2eva;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorAleatorio {

	
	
	
	public static Integer[] generarNumerosunicosOrdenados(int cantidad, int maximo){
		Random random = new Random();
		Set<Integer> listaNumerosRandoms = new HashSet<>();
		Integer[] arrayNumeros = new Integer[cantidad];
		
		while(listaNumerosRandoms.size()<= cantidad) {
		listaNumerosRandoms.add(random.nextInt(maximo)+1);
		}
		
		arrayNumeros = listaNumerosRandoms.toArray(arrayNumeros);
		return arrayNumeros;
	}
	
	public static void main(String[] args) {
		
		
		Integer[] arrayNuevo = generarNumerosunicosOrdenados(5, 10);
		
		for(Integer recorrer : arrayNuevo) {
		System.out.println(recorrer);
		}
		
	}
	
}
