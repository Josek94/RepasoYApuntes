package repasoexamen2eva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ElementoQuimico {

	private String simbolo;
	private String nombreElemento;
	private int numeroAtomico;
	private static Random random = new Random();
	//private static List<ElementoQuimico> listaDeElementos = new ArrayList<>();
	private static Set<ElementoQuimico> setDeElementos = new HashSet<>
	(Set.of(new ElementoQuimico("H", "Hidrógeno", 1),
            new ElementoQuimico("He", "Helio", 2),
            new ElementoQuimico("Li", "Litio", 3),
            new ElementoQuimico("Be", "Berilio", 4),
            new ElementoQuimico("B", "Boro", 5),
            new ElementoQuimico("C", "Carbono", 6),
            new ElementoQuimico("N", "Nitrógeno", 7),
            new ElementoQuimico("O", "Oxígeno", 8),
            new ElementoQuimico("F", "Flúor", 9),
            new ElementoQuimico("Ne", "Neón", 10),
            new ElementoQuimico("Na", "Sodio", 11),
            new ElementoQuimico("Mg", "Magnesio", 12),
            new ElementoQuimico("Al", "Aluminio", 13),
            new ElementoQuimico("Si", "Silicio", 14),
            new ElementoQuimico("P", "Fósforo", 15),
            new ElementoQuimico("S", "Azufre", 16),
            new ElementoQuimico("Cl", "Cloro", 17),
            new ElementoQuimico("Ar", "Argón", 18),
            new ElementoQuimico("K", "Potasio", 19),
            new ElementoQuimico("Ca", "Calcio", 20)));
	
	
	public ElementoQuimico(String simbolo, String nombreElemento, int numeroAtomico) {
		this.simbolo = simbolo;
		this.nombreElemento = nombreElemento;
		this.numeroAtomico = numeroAtomico;
	}

	
	

	
	
	@Override
	public String toString() {
		return "ElementoQuimico [simbolo=" + simbolo + ", nombreElemento=" + nombreElemento + ", numeroAtomico="
				+ numeroAtomico + "]";
	}






	public static ElementoQuimico[] generarElementosAleatorios(int cantidad) {
		List<ElementoQuimico> listaDeElementosQuimicos = new ArrayList<>(setDeElementos);
		Collections.shuffle(listaDeElementosQuimicos);
		ElementoQuimico[] arrayDeElementos = new ElementoQuimico[cantidad];
		for(int i = 0; i < cantidad;i++) {
			arrayDeElementos[i] = listaDeElementosQuimicos.get(i);
			
		}
		
		return arrayDeElementos;
	}
	
	public static void main(String[] args) {
		
		for(ElementoQuimico recorrer : generarElementosAleatorios(10)) {
			System.out.println(recorrer);
		}
		
		
		
		
		
	}
}
