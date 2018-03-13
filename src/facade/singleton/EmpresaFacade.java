package facade.singleton;

public class EmpresaFacade {
	
	
	protected EmpresaFacade(){}
	
	/* FACADE
	 * Provê uma interface única para muitos acessos
	 * 
	 * vantagens: Centraliza em uma unica instancia de uma classe diversas operações comuns
	 * 
	 * desvantagens: 
	 * - Não entender o conceito corretamente implica em misturar regras de negocio 
	 * em classes de fachadas.
	 * 
	 * - Afeta a coesão alta
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
