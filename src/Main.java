

public class Main {

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Conta cc = new ContaCorrente(cliente);
		
		cc.depositar(1000);
		System.out.println(String.format( "%.2f" , cc.getSaldo()));
		
		
		
	}
}
