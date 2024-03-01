package empresa;

public class Principal {

	public static void main(String[] args) {
		
		
	//Tema 2
		//Funcionario f1 = new Funcionario("Mario");
		//Funcionario f2 = f1;
		
		//System.out.println("Nome f1: " + f1.nome);
		//System.out.println("Nome f2: " + f2.nome);
		
		
		//System.out.println();
		
		//f2.nome="Luigi";
		
		//System.out.println("Nome f1: " + f1.nome);
		//System.out.println("Nome f2: " + f2.nome);
		
		
		Funcionario f3 = new Assalariado("Mario",3500);
		
		f3 = new Horista("Luigi",100,40.5f);
		
		Funcionario funcionarios[] = { 	new Assalariado("Mario",3500),
										new Horista("Luigi",100,40.5f),
										new Comissionado("Yoshi",50000,0.05f)};
		Funcionario f;
		float total=0;
		for(int i=0; i<funcionarios.length;i++) {
			f= funcionarios[i];
			System.out.println(f.nome + " salario: " + f.pagamento());
			total += f.pagamento();
		}
		
		System.out.println("Total: " + total);
	//Tema 3
		//Funcionario f4 = new Funcionario("Mario"); 
		Funcionario f4 = new Assalariado("Mario",1000); 
		
	//Tema 4
		
		Gato g1 = new Gato();
		Animal a1 = new Gato();
		
		a1.emitirSom();
		g1.emitirSom();
		a1.dormir();
		g1.dormir();
		
	//Tema 5
		
		Roupa r1 = new Roupa ("Camisa",3,Estacao.OUTONO);
		r1.msg();


	}
}
