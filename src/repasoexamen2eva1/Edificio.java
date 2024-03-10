package repasoexamen2eva1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Edificio {
	static Random random = new Random();
	
	
	private String nombre;
	private int diasDeFuncionamientoDelEdificio;
	private UnidadCreacion cantidadQueFabrica;
	private Set<Galleta> posiblesGalletasParaFabricar = new HashSet<>();
	private Galleta[] galletasEnFabricacion = new Galleta[3];
	private Map<Galleta, Integer> ListaContabilizadaDeGalletas = new TreeMap<>();
	
	
	
	public Edificio(String nombre, int diasDeFuncionamientoDelEdificio) {
		this.nombre = nombre;
		this.diasDeFuncionamientoDelEdificio = diasDeFuncionamientoDelEdificio;
		this.cantidadQueFabrica = UnidadCreacion.values()[(random.nextInt(UnidadCreacion.values().length))];
		this.posiblesGalletasParaFabricar = generaGalletaAleatoria();
		this.galletasEnFabricacion = rellenarArray();
		
	}
	
	
	public Set<Galleta> generaGalletaAleatoria(){
		
		Set<Galleta> listaDeGalletas = new HashSet<>();
		int cantidad = random.nextInt(3, 100)+1;
		
		while(listaDeGalletas.size() < cantidad) {
			listaDeGalletas.add(new Galleta());
		}
		
		return listaDeGalletas;
	}
	
	public Galleta[] rellenarArray() {
		Galleta[] arrayDeGalletas = new Galleta[3];
		List<Galleta> listaDeGalletas = new ArrayList<>(posiblesGalletasParaFabricar);
		Collections.shuffle(listaDeGalletas);
		for(int i = 0; i < arrayDeGalletas.length;i++) {
			arrayDeGalletas[i] = listaDeGalletas.get(i);
		}
		return arrayDeGalletas;
	}
	
	
	public UnidadCreacion aumentarCantidadDeFabricacion() {
		setCantidadQueFabrica(cantidadQueFabrica.aumentarProduccion());
		
		return cantidadQueFabrica;
	}

	
	public UnidadCreacion disminuirCantidadDeFabricacion() {
		setCantidadQueFabrica(cantidadQueFabrica.disminuirProduccion());
		
		return cantidadQueFabrica;
	}
	
	public int aumentarDiaDeProduccion() {
		return diasDeFuncionamientoDelEdificio++;
	}

	public void reiniciarProduccion() {
		diasDeFuncionamientoDelEdificio = 1;
		cantidadQueFabrica = UnidadCreacion.values()[(random.nextInt(UnidadCreacion.values().length))];
		posiblesGalletasParaFabricar = generaGalletaAleatoria();
		galletasEnFabricacion = rellenarArray();
	}


	public void setCantidadQueFabrica(UnidadCreacion cantidadQueFabrica) {
		this.cantidadQueFabrica = cantidadQueFabrica;
	}

	
	
	public void reportEdificio() {
		System.out.printf("----Report edificio----%n"
						+ "Nombre: %s%n"
						+ "Dias de funcionamiento: %d%n"
						+ "");
	}


	
	
	
}
