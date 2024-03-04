package repasoexamen2eva;

public class EstadoPedidoTest {
	
	EstadoPedido pedido;
	
	public EstadoPedidoTest() {
		this.pedido = EstadoPedido.PENDIENTE;
	}
	


	public EstadoPedido getPedido() {
		return pedido;
	}


	public void setPedido(EstadoPedido pedido) {
		this.pedido = pedido;
	}



	public static void main(String[] args) {
		
		
		EstadoPedidoTest p1 = new EstadoPedidoTest();
		
		System.out.println(p1.getPedido());
		
		p1.setPedido(p1.getPedido().siguienteEstado());
		System.out.println(p1.getPedido());
		p1.setPedido(p1.getPedido().siguienteEstado());
		System.out.println(p1.getPedido());
	}



	
}
