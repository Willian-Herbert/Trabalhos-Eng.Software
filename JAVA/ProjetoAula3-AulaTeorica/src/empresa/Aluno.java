package empresa;

public class Aluno {
	private int matricula;
	public String nome;
	public String cpf;
	protected int notas[];
	
	void info() {

		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}

	public Aluno(){
		System.out.println("Aluno criado sem parametros");
	}
	
	public Aluno (int matricula,String nome,String cpf){
		this.matricula= matricula;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Aluno(int matricula) {
		this.matricula = matricula;
		this.nome = "Vazio";
		this.cpf = "000.000.000-00";
	}
}
