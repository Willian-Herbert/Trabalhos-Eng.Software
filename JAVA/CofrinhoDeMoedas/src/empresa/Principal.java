package empresa;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int tipo = 1,qtd;
		Moeda moeda;
		
		//Cria o objeto cofrinho e começa a solicitar as operações desejadas.
		Cofrinho c1 = new Cofrinho();
		Scanner teclado = new Scanner(System.in);
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Adicionar Moedas.");
		System.out.println("2 - Remover Moedas.");
		System.out.println("3 - Listar Moedas.");
		System.out.println("4 - Total em Reais.");
		System.out.println("0 - Sair");		
		tipo = teclado.nextInt();	
		
		//Enquanto o valor informado não for 0 o programa fica rodando, faz a verificação se a entrada é uma opção válida e se não recomeça o programa.
		//De acordo com a opção escolhida, executa o case solicitando informações complementares quando necessário e por fim executa o comando da opção escolhida.
		//Após executar, volta para o começo solicitando mais alguma operação.
		while(tipo != 0) {
			if(tipo > 0 && tipo < 5) {
				switch(tipo) {
				case 1:
					moeda = null;
					System.out.println("Qual moeda deseja adicionar?");
					System.out.println("1 - Dolar.");
					System.out.println("2 - Euro.");
					System.out.println("3 - Real.");
					int tipomoeda = teclado.nextInt();
					if (tipomoeda == 1) {
						System.out.println("Quanto deseja adicionar?");
						qtd = teclado.nextInt();
						while (qtd <= 0) {
							System.out.println("Quantidade inválida, insira um valor correto.");
							System.out.println("Quanto deseja adicionar?");
							qtd = teclado.nextInt();		
						}
						moeda = new Dolar(qtd);
						c1.Add(moeda);
					}
					else if (tipomoeda == 2) {
						System.out.println("Quanto deseja adicionar?");
						qtd = teclado.nextInt();
						while (qtd <= 0) {
							System.out.println("Quantidade inválida, insira um valor correto.");
							System.out.println("Quanto deseja adicionar?");
							qtd = teclado.nextInt();		
						}
						moeda = new Euro(qtd);
						c1.Add(moeda);
					}
					else if (tipomoeda == 3) {
						System.out.println("Quanto deseja adicionar?");
						qtd = teclado.nextInt();
						while (qtd <= 0) {
							System.out.println("Quantidade inválida, insira um valor correto.");
							System.out.println("Quanto deseja adicionar?");
							qtd = teclado.nextInt();		
						}
						moeda = new Real(qtd);
						c1.Add(moeda);
					}
					else {
						System.out.println("Tipo de moeda inválida, voltando ao início.");
					}
					break;
				case 2:
					moeda = null;
					System.out.println("Qual moeda deseja remover?");
					System.out.println("1 - Dolar.");
					System.out.println("2 - Euro.");
					System.out.println("3 - Real.");
					tipomoeda = teclado.nextInt();
					if (tipomoeda == 1) {
						System.out.println("Quanto deseja remover?");
						qtd = teclado.nextInt();
						while (qtd <= 0) {
							System.out.println("Quantidade inválida, insira um valor correto.");
							System.out.println("Quanto deseja remover?");
							qtd = teclado.nextInt();
						}
						moeda = new Dolar(qtd);
						c1.Remove(moeda);
					}
					else if (tipomoeda == 2) {
						System.out.println("Quanto deseja remover?");
						qtd = teclado.nextInt();
						while (qtd <= 0) {
							System.out.println("Quantidade inválida, insira um valor correto.");
							System.out.println("Quanto deseja remover?");
							qtd = teclado.nextInt();
						}
						moeda = new Euro(qtd);
						c1.Remove(moeda);
					}
					else if (tipomoeda == 3) {
						System.out.println("Quanto deseja remover?");
						qtd = teclado.nextInt();
						while (qtd <= 0) {
							System.out.println("Quantidade inválida, insira um valor correto.");
							System.out.println("Quanto deseja remover?");
							qtd = teclado.nextInt();
						}
						moeda = new Real(qtd);
						c1.Remove(moeda);
					}
					else {
						System.out.println("Tipo de moeda inválida, voltando ao início");
					}
					break;
				case 3:
					c1.listar();
					break;
				case 4:
					c1.total();
					break;
				}
			}
			else {
				System.out.println("Opção inexistente, escolha uma opção válida.");
			}
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar Moedas.");
			System.out.println("2 - Remover Moedas.");
			System.out.println("3 - Listar Moedas.");
			System.out.println("4 - Total em Reais.");
			System.out.println("0 - Sair");		
			tipo = teclado.nextInt();	
		}
		System.out.println("Programa encerrado");
	}
}
