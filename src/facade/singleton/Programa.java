package facade.singleton;

/* Implementação apenas demonstrativa de FACADE e SINGLETON */
public class Programa {
	public static void main(String[] args) {
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		
		// argumentos
		String cpf = "123";
		double valor = 32;
		Cliente cliente = new Cliente();
		Fatura fatura = new Fatura(cliente, valor);
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		
		facade.buscaCliente(cpf);
		facade.geraFatura(cliente, valor);
		facade.fazContato(cliente, cobranca);
		facade.geraCobranca(Tipo.BOLETO, fatura);
	}
}
