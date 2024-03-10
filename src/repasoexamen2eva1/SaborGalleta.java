package repasoexamen2eva1;

public enum SaborGalleta {

	BL("chocolate blanco", false),
	NE("chocolate negro", true),
	VA("helado vainilla", false),
	TU("helado turrón", true),
	PL("fruta plátano", false),
	FR("fruta fresa", true);
	
	
	
	private String nombre;
	private boolean saborIntenso;
	
	
	
	private SaborGalleta(String nombre, boolean saborIntenso) {
		this.nombre = nombre;
		this.saborIntenso = saborIntenso;
	}



	public String getNombre() {
		return nombre;
	}



	public boolean isSaborIntenso() {
		return saborIntenso;
	}
	
	
	public boolean esCochocolate() {
		if(getNombre().contains("chocolate")) {
			return true;
		}
		return false;
	}
	
	public boolean esHelado() {
		if(getNombre().contains("helado")) {
			return true;
		}
		return false;
	}
	
	public boolean esFruta() {
		if(getNombre().contains("fruta")) {
			return true;
		}
		return false;
	}
	
	public void tieneSaborIntenso() {
		if(isSaborIntenso()) {
			System.out.printf("El sabor %s es %s",getNombre(),isSaborIntenso() == true? "es intenso" : "no es intenso");
		}
	}
	
	
}
