package repasoexamen2eva;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ContadorDeMultiplos {

	
	public static Set<Integer> generaListaDeNumerosAleatorios(int cantidad, int maximo){
		Set<Integer> listaDeNumeros = new HashSet<>();
		Random random = new Random();
		
		while(listaDeNumeros.size() < cantidad) {
		listaDeNumeros.add(random.nextInt(maximo)+1);  
			
		}
		
		
		
		return listaDeNumeros;
	}
	
	public static Map<Integer, Integer> generarListaDeMultiplos(Set<Integer> listaDeNumeros){
		Map<Integer, Integer> multiplosDeNumeros = new HashMap<>();
		multiplosDeNumeros.put(2, null);
		multiplosDeNumeros.put(3, null);
		multiplosDeNumeros.put(5, null);
		multiplosDeNumeros.put(7, null);
		multiplosDeNumeros.put(11, null);
		multiplosDeNumeros.put(13, null);
		multiplosDeNumeros.put(17, null);
		
		for(Integer recorrer : listaDeNumeros) {
			if(recorrer % 2 == 0) {
				multiplosDeNumeros.compute(2, (key,valor)-> valor == null? 1 : valor+1);
			} else if(recorrer % 3 == 0) {
				multiplosDeNumeros.compute(3, (key,valor)-> valor == null? 1 : valor+1);	
			} else if(recorrer % 5 == 0) {
				multiplosDeNumeros.compute(5, (key,valor)-> valor == null? 1 : valor+1);	
			} else if(recorrer % 7 == 0) {
				multiplosDeNumeros.compute(7, (key,valor)-> valor == null? 1 : valor+1);	
			} else if(recorrer % 11 == 0) {
				multiplosDeNumeros.compute(11, (key,valor)-> valor == null? 1 : valor+1);	
			} else if(recorrer % 13 == 0) {
				multiplosDeNumeros.compute(13, (key,valor)-> valor == null? 1 : valor+1);	
			} else if(recorrer % 17 == 0) {
				multiplosDeNumeros.compute(17, (key,valor)-> valor == null? 1 : valor+1);	
			}
		}
		
		
		return multiplosDeNumeros;
	}
	
	public static void main(String[] args) {
		
		
		
		Set<Integer> listaDeNumeros1 = generaListaDeNumerosAleatorios(100, 1000);
		
		Map<Integer, Integer> listaDeMultiplos = generarListaDeMultiplos(listaDeNumeros1);
		
		listaDeMultiplos.forEach((key,valor) -> System.out.println("key: " + key + " valor: " + valor));
		
	}
	
	
}
