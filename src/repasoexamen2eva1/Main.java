package repasoexamen2eva1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	
	public static void main(String[] args) {
		
		Set<Galleta> listaGalletas = new HashSet<>();
		Galleta g1 = new Galleta(SaborGalleta.BL, 42);
		Galleta g2 = new Galleta(SaborGalleta.BL, 42);
		listaGalletas.add(g2);
		listaGalletas.add(g1);
		
		
	}
}
