package repasoexamen2eva;

public class NivelAccesoTest {
	
  NivelAcceso nivel;
	
  
  public NivelAccesoTest(NivelAcceso nivel) {
		this.nivel = nivel;
	}
  
  
  
	public NivelAcceso getNivel() {
	return nivel;
}



	public static void main(String[] args) {
		
		NivelAccesoTest n1 = new NivelAccesoTest(NivelAcceso.ADMINISTRADOR);
		NivelAccesoTest n2 = new NivelAccesoTest(NivelAcceso.EDITOR);
		NivelAccesoTest n3 = new NivelAccesoTest(NivelAcceso.VISITANTE);
		
		
		
		System.out.println(n1.getNivel().puedeEditar());
		System.out.println(n3.getNivel().puedeEditar());
		System.out.println(n2.getNivel().puedeEditar());
	}




	
}
