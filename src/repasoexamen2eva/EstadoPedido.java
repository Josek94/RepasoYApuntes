package repasoexamen2eva;

public enum EstadoPedido {

	PENDIENTE("Tu pedido esta pendiente de entrega.", 1), PROCESANDO("Tu pedido se esta procesando...", 2),
	ENVIANDO("Tu pedido ha siendo enviado.", 3), ENTREGADO("Tu pedido ha sido entregado con exito.", 4);

	private String mensaje;
	private int codigo;

	private EstadoPedido(String mensaje, int codigo) {
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public EstadoPedido siguienteEstado() {
		switch (this) {
		case PENDIENTE: {

			return PROCESANDO;
		}
		case PROCESANDO: {

			return ENVIANDO;
		}
		case ENVIANDO: {

			return ENTREGADO;
		}
		default:
			return this;
		}

	}
	
	
	

}
