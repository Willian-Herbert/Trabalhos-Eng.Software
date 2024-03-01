package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	//Cria a lista para adicionar as moedas, abaixo contém as operações de adicionar, remover, listar e o total do cofrinho, que são chamadas na classe principal.
	ArrayList<Moeda> ListaMoedas = new ArrayList<Moeda>();

	public void Add(Moeda m) {
		ListaMoedas.add(m);
	}
	
	public void Remove(Moeda m) {
		ListaMoedas.remove(m);
	}
	
	public void listar() {
		for (Moeda m : ListaMoedas) {
			System.out.println(m);
		}	
	}
	
	public void total( ) {
		double total = 0;
		for(Moeda m: ListaMoedas) {
			total += m.getValor();
		}
		System.out.println("Total convertido para reais: " + total);	
	}
}
