package repasoexamen2eva;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class GeneradorAleatorioTree {

	
	public static Set<Integer> generarNumerosUnicosOrdenados(int cantidad, int maximo) {
		Random random = new Random();
		Set<Integer> listaTree = new TreeSet<>();
		while(listaTree.size() < cantidad) {
		listaTree.add(random.nextInt(maximo)+1);
		}
		
		return listaTree;
	}
	
public static void main(String[] args) {
	
	Set<Integer> listaTree = new TreeSet<>();
	
	listaTree = generarNumerosUnicosOrdenados(10, 15);
	
	listaTree.forEach(s -> System.out.println(s));
}
	
	
}
