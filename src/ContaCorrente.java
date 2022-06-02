

public class ContaCorrente extends Conta{
	
	private static ContaCorrente contaCorrente;
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		contaCorrente = new ContaCorrente(cliente);
	
	}
	public void sacar(double valor) {
		saldo -= (valor - 0.70) ;
	}
	public void transfere(Conta conta, double valor) {
		saldo -= (valor - 0.70) ;
		conta.depositar(valor);
	}

	
}
