package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		
		
		//Tema 1
		Aluno a = new Aluno(1001,"Super Mario","222.333.444-55");
		a.info();
		
		//Tema 2
		Horario aula = new Horario();
		//aula.setHora(40);
		aula.setHora(19);
		
		//Tema 3
		//ArrayList<String> pessoas = new ArrayList();
		LinkedList<String> pessoas = new LinkedList();
		
		pessoas.add("Mario");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		//System.out.println(pessoas.get(0));
		//pessoas.remove(1);
		
		System.out.println("Ordem alfabética");
		System.out.println(pessoas);
		
		System.out.println("Ordem alfabética");
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		
		System.out.println("Ordem shuffle");
		Collections.shuffle(pessoas);
		System.out.println(pessoas);
		
		
		System.out.println(Collections.min(pessoas));
		System.out.println(Collections.max(pessoas));
		
		
		HashMap<String,String> capitais = new HashMap();
		
		capitais.put("Brasil","Brasilia");
		capitais.put("Argentina","Buenos Aires");
		capitais.put("Paraguai","Assunção");
		capitais.put("Uruguai","Montevidéu");
		
		System.out.println(capitais);
		System.out.println(capitais.get("Uruguai"));
		
		//Tema 4
		
		ArrayList<Integer> lista = new ArrayList();
		HashSet<Integer> conjunto = new HashSet();
		HashMap<String,Integer> mapa = new HashMap();
		
		int soma;
		soma=0;
		for (int i = 0; i < lista.size(); i++) {
			soma+=lista.get(i);
		}
		
		soma =0;
	
		for(int item : lista) {
			soma+=item;
		}
		
		soma=0;
		
		//Iterator it = lista.mapa.entrySet().iterator();
		//Iterator it = conjunto.iterator();
		Iterator it = lista.iterator();
		
		while(it.hasNext()) {
			soma +=(int)it.next();
		}
		
		//Tema 5
		
		LocalDate dataHoje = LocalDate.now();
		
		System.out.println(dataHoje);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		System.out.println(dataHoje.format(formatador));
		
		
		
	}
}
