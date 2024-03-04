package repasoexamen2eva;

public class NivelAlertaTest {
	
	NivelAlerta alerta;
	
	
	public NivelAlertaTest() {
		this.alerta = NivelAlerta.BAJO;
	}
	
	
	
	
	public NivelAlerta getAlerta() {
		return alerta;
	}




	public void setAlerta(NivelAlerta alerta) {
		this.alerta = alerta;
	}




	public static void main(String[] args) {
		
		NivelAlertaTest na1 = new NivelAlertaTest();
		
		System.out.println(na1.getAlerta());
		na1.setAlerta(na1.getAlerta().escalar());
		System.out.println(na1.getAlerta());
		na1.setAlerta(na1.getAlerta().desescalar());
		System.out.println(na1.getAlerta());
	}





	
}
