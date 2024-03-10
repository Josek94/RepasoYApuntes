package repasoexamen2eva1;

import java.util.Objects;
import java.util.Random;

public class Galleta {

	private SaborGalleta saborDegalleta;
	private int cantidadPepitas;
	Random random = new Random();
	
	
	public Galleta() {
		this.saborDegalleta = SaborGalleta.values()[(random.nextInt(SaborGalleta.values().length))];
		this.cantidadPepitas = random.nextInt(10,100)+1;
	}


	public Galleta(SaborGalleta saborDegalleta, int cantidadPepitas) {
		this.saborDegalleta = saborDegalleta;
		this.cantidadPepitas = cantidadPepitas;
	}


	@Override
	public String toString() {
		return String.format("Sabor de la galleta: %s%n"
				+ "Número de pepitas: %d%n", saborDegalleta.getNombre(),cantidadPepitas);
	}


	public SaborGalleta getSaborDegalleta() {
		return saborDegalleta;
	}


	public int getCantidadPepitas() {
		return cantidadPepitas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cantidadPepitas, saborDegalleta);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Galleta other = (Galleta) obj;
		return cantidadPepitas == other.cantidadPepitas && saborDegalleta == other.saborDegalleta;
	}
	
	
	
	
	
	
	
}
