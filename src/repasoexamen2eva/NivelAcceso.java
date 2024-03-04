package repasoexamen2eva;

public enum NivelAcceso {

	ADMINISTRADOR("crear, editar, eliminar"),EDITOR("editar, eliminar"),VISITANTE("leer");
	
	private String permisos;

	private NivelAcceso(String permisos) {
		this.permisos = permisos;
	}

	public String getPermisos() {
		return permisos;
	}
	
	
	public boolean puedeEditar() {
		if(this.getPermisos().contains("editar")) {
			return true;
		} else {
			return false;
		}
	}
	
}
