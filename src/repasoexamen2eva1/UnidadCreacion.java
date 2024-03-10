package repasoexamen2eva1;

public enum UnidadCreacion {
	ML("millones"),BI("billones"),TR("trillones"),CU("cuatrillones"),QU("quintilones"),AL("años luz");
	
	private String nombreUnidad;

	private UnidadCreacion(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}
	
	public UnidadCreacion aumentarProduccion() {
		switch (this) {
		case ML: {
			
			return BI;
		}
		case BI: {
			
			return TR;
		}
		case TR: {
	
			return CU;
		}
		case CU: {
	
			return QU;
		}
		case QU: {
	
			return AL;
		}
			default:
				return this;
		}
		
		
	}
	
	public UnidadCreacion disminuirProduccion() {
			switch (this) {
			case AL: {
				
				return QU;
			}
			case QU: {
				
				return CU;
			}
			case CU: {
		
				return TR;
			}
			case TR: {
		
				return BI;
			}
			case BI: {
		
				return ML;
			}
				default:
					return this;
			}
			
			//ML,BI,TR,CU,QU,AL
		}
	
	
}
