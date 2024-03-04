package repasoexamen2eva;

public class ClasificacionVideojuegoTest {

	ClasificacionVideojuego parametros;
	
	
	public ClasificacionVideojuegoTest(ClasificacionVideojuego parametros) {
		this.parametros = parametros;
	}
	
	
	
	public ClasificacionVideojuego getParametros() {
		return parametros;
	}



	public void setParametros(ClasificacionVideojuego parametros) {
		this.parametros = parametros;
	}



	public static void main(String[] args) {
	

		ClasificacionVideojuegoTest cv1 = new ClasificacionVideojuegoTest(ClasificacionVideojuego.SIMULACION);
		
		System.out.println(cv1.getParametros().esMultijugador());
		System.out.println(cv1.getParametros().esAptoParaMenores());
		
	}




	
}
