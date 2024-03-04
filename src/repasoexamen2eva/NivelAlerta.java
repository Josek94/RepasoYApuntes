package repasoexamen2eva;

public enum NivelAlerta {

	BAJO("Nivel bajo: ataque con poco riesgo de filtrado de archivos o encriptado","Es recomendable revisar los cortafuegos y de mas medidas preventivas"), 
	MEDIO("Nivel medio: posible filtracion de informacion, solucionar antes de empeorar","Revisar la vulnerabilidad de servidor y sus posibles puntos flacos"), 
	ALTO("Nivel alto: el servidor a sido vulnerado","comprobar el log y vigilar el trafico"), 
	CRITICO("Nivel critico: game over","Desconectar el servidor de la red");
	
	private String descripcion;
	private String accionesRecomendadas;
	
	
	private NivelAlerta(String descripcion, String accionesRecomendadas) {
		this.descripcion = descripcion;
		this.accionesRecomendadas = accionesRecomendadas;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public String getAccionesRecomendadas() {
		return accionesRecomendadas;
	}
	
	public NivelAlerta escalar() {
		switch (this) {
		case BAJO: {
			return MEDIO;
		}
		case MEDIO: {
			return ALTO;
		}
		case ALTO: {
			return CRITICO;
		}
		default:
			return this;
		}
	}
	
	public NivelAlerta desescalar() {
		switch (this) {
		case CRITICO: {
			return ALTO;
		}
		case ALTO: {
			return MEDIO;
		}
		case MEDIO: {
			return BAJO;
		}
		default:
			return this;
		}
	}
	
}
