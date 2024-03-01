package empresa;


enum Estacao{
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}

public class Roupa {

	String modelo;
	int tamanho;
	//int colecao; // 1 VERAO; 2 OUTONO; 3 INVERNO; 4 PRIMAVERA
	Estacao colecao;
	
	public Roupa(String modelo, int tamanho, Estacao colecao) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}
	
	public void msg() {
		switch(colecao) {
		case VERAO:
			System.out.println("Arrase na praia!");
			break;
		case OUTONO:
			System.out.println("Passe o outono com elegancia!");
			break;
		case INVERNO:
			System.out.println("Se agasalhe com estilo!");
			break;
		case PRIMAVERA:
			System.out.println("Se vista bem na esta��o das flores!");
			break;
		default:
			System.out.println("Erro");
		
		}
	}
	
	
/*	public void msg() {
		switch(colecao) {
		case 1:
			System.out.println("Arrase na praia!");
			break;
		case 2:
			System.out.println("Passe o outono com elegancia!");
			break;
		case 3:
			System.out.println("Se agasalhe com estilo!");
			break;
		case 4:
			System.out.println("Se vista bem na esta��o das flores!");
			break;
		default:
			System.out.println("Erro");
		
		}
	}
*/	
}
