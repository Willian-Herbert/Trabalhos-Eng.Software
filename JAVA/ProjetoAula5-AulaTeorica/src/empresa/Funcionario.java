package empresa;

public abstract class Funcionario {
	
	String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
/*	public float pagamento() {
		System.out.println("Processamento pagamento");
		return 0.0f;
	}
*/	
	public abstract float pagamento();

}
