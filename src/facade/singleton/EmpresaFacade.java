package facade.singleton;

public class EmpresaFacade {
	
	
	protected EmpresaFacade(){}
	
	/* FACADE
	 * Prov� uma interface �nica para muitos acessos
	 * 
	 * vantagens: Centraliza em uma unica instancia de uma classe diversas opera��es comuns
	 * 
	 * desvantagens: 
	 * - N�o entender o conceito corretamente implica em misturar regras de negocio 
	 * em classes de fachadas.
	 * 
	 * - Afeta a coes�o alta
	 * */
	public Cliente	buscaCliente(String cpf){
		Cliente cliente = new ClienteDAO().buscaPorCPF(cpf);
		return cliente;
	}
	
	
	public Cobranca geraCobranca(Tipo tipo, Fatura fatura){
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		return cobranca;
	}
	
	
	public Fatura geraFatura(Cliente cliente, double valor){
		Fatura fatura = new Fatura(cliente, 500.0);
		return fatura;
	}
	
	
	public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca){
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();
		
		return contato;
	}
}
