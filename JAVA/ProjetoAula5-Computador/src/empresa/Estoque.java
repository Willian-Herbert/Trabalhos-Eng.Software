package empresa;

import java.util.ArrayList;

public class Estoque {
	
	
	ArrayList<Computador> listaComputador = new ArrayList<Computador>();
	
	
	public void adicionar(Computador c) {
		listaComputador.add(c);
	}
	
	public void remover(Computador c) {
		listaComputador.remove(c);
	}
	
	public void listar() {
		
		for (Computador c : listaComputador) {
			System.out.println(c);
		}
	}
	

}
