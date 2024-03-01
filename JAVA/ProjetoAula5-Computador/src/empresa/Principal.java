package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		
		Estoque estoque = new Estoque();
		
		System.out.println("Menu");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("0-Encerrar");
		opcao=teclado.nextInt();
		
		int tipoComp,gb,processadores;
		double polegadas,acessorios;
		Computador comp;
		
		while(opcao!=0) {
			
			switch(opcao) {
			
			case 1:
				tipoComp=0;
				while(tipoComp>2 || tipoComp<=0) {
					System.out.println("1-Desktop");
					System.out.println("2-Notebook");
					tipoComp = teclado.nextInt();
				}
				System.out.println("Quantos Gb de memoria?");
				gb = teclado.nextInt();
			
				System.out.println("Quantos Processadores?");
				processadores = teclado.nextInt();
				
				comp =null;
				if(tipoComp==1) {
					System.out.println("Valor dos acessorios?");
					acessorios = teclado.nextDouble();
					comp = new Desktop(gb,processadores,acessorios);
				}
				else {
					System.out.println("Quantas polegadas possui a tela?");
					polegadas = teclado.nextDouble();
					comp = new Notebook(gb,processadores,polegadas);
				}
				
				estoque.adicionar(comp);
				
				
				break;
			case 2:
				tipoComp=0;
				while(tipoComp>2 || tipoComp<=0) {
					System.out.println("1-Desktop");
					System.out.println("2-Notebook");
					tipoComp = teclado.nextInt();
				}
				System.out.println("Quantos Gb de memoria?");
				gb = teclado.nextInt();
			
				System.out.println("Quantos Processadores?");
				processadores = teclado.nextInt();
				
				comp =null;
				if(tipoComp==1) {
					System.out.println("Valor dos acessorios?");
					acessorios = teclado.nextDouble();
					comp = new Desktop(gb,processadores,acessorios);
				}
				else {
					System.out.println("Quantas polegadas possui a tela?");
					polegadas = teclado.nextDouble();
					comp = new Notebook(gb,processadores,polegadas);
				}
				
				estoque.remover(comp);
				
				
				break;
			case 3:
				estoque.listar();
				break;
			default:
				System.out.println("Opcao invalida!");				
			}
			
			System.out.println("Menu");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("0-Encerrar");
			opcao=teclado.nextInt();				
			
		}
		
		
		
		

		
	}
}
