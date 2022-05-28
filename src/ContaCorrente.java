

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	public void sacar(double valor) {
		saldo -= (valor - 0.50) ;
	}
	public void transfere(Conta conta, double valor) {
		saldo -= (valor - 0.70) ;
		conta.depositar(valor);
	}

	
}
