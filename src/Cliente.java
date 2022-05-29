
public class Cliente {
	
	private static Cliente cliente;
	
	private Cliente() {
		super();
	};
	
	public static Cliente newCliente() {
		if(cliente == null) {
			cliente = new Cliente();
		}
		return cliente;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
