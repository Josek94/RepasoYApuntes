package repasoexamen2eva;

public enum ClasificacionVideojuego {

	ACCION("Este tipo de juego consiste en luchar y pelear.","Adultos","Individual"), 
	AVENTURA("Caracterizados por la investigación, exploración, la solución de rompecabezas.","Todos","Individual"), 
	ESTRATEGIA("El factor de la inteligencia, habilidades técnicas, planificación y despliegue, pueden hacer predominar al jugador hacia la victoria del juego.","Adultos","Multijugador"), 
	SIMULACION("Videojuegos que intentan recrear situaciones de la vida real​.","Menores","Individual"), 
	DEPORTES("Simula el campo de deportes tradicionales.","Todos","Multijugador");
	
	
	private String descripcion;
	private String rangoEdad;
	private String jugabilidad;
	
	
	private ClasificacionVideojuego(String descripcion, String rangoEdad, String jugabilidad) {
		this.descripcion = descripcion;
		this.rangoEdad = rangoEdad;
		this.jugabilidad = jugabilidad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public String getRangoEdad() {
		return rangoEdad;
	}


	public String getJugabilidad() {
		return jugabilidad;
	}
	
	
	public boolean esAptoParaMenores() {
		if(this.rangoEdad.contains("Todos") || this.rangoEdad.contains("Menores")) {
			return true;
		} else {
			return false;	
		}
		
	}
	
	public boolean esMultijugador() {
		if(this.jugabilidad.contains("Multijugador")) {
			return true;
		} else {
			return false;	
		}
	}
	
	
}
