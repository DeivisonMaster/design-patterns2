package facade.singleton;

public class ContatoCliente {
	private Cliente cliente;
	private Cobranca cobranca;

	public ContatoCliente(Cliente cliente, Cobranca cobranca) {
		this.cliente = cliente;
		this.cobranca = cobranca;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Cobranca getCobranca() {
		return cobranca;
	}

	public void dispara() {
		// faz alguma coisa
	}

}
