package repasoexamen2eva;

public enum ElementoQuimicoEnum {

	
	H("Hidrógeno",1),
	He("Helio",  2),
	Li("Litio",3),
	Be("Berilio", 4),
	B("Boro",5),
	C("Carbono", 6),
	N("Nitrógeno",7),
	O("Oxígeno",8),
	F("Flúor", 9),
	Ne("Neón" ,10),
	Na("Sodio" ,11),
	Mg("Magnesio",12),
	Al("Aluminio",13),
	Si("Silicio", 14),
	P("Fósforo", 15),
	S("Azufre", 16),
	Cl("Cloro", 17),
	Ar("Argón", 18),
	K("Potasio", 19),
	Ca("Calcio", 20);
	
	String nombreCompleto;
	int numeroAtomico;
	
	
	private ElementoQuimicoEnum(String nombreCompleto, int numeroAtomico) {
		this.nombreCompleto = nombreCompleto;
		this.numeroAtomico = numeroAtomico;
	}
	
	
	
}
