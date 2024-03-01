package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Funcionario f = new Funcionario("Mario","111.222.333-44");
		Carro c = new Carro("Palio","cinza",4);
		Quadrado q = new Quadrado(10);
		
		ArrayList<Imprimivel> lista = new ArrayList();
		lista.add(f);
		lista.add(c);
		lista.add(q);
		
		for(Imprimivel i : lista) {
			i.imprimir();
		}


	}
}
