package empresa;

import java.util.Objects;

public class Dolar extends Moeda{
	
	//Classe filha da classe moeda, possui uma variável com seu nome para diferenciação. Abaixo tem o método info que possui as informações da classe.
	//O método converter, pega o valor da moeda adicionada e converte para o valor em real
	//O toString faz uma definição de como deve ser a apresentação do objeto na lista e o equals faz a comparação para quando precisar remover o objeto da lista.
	String nome = "Dolar";
	
	@Override
	public void info() {
		System.out.println(nome);
		System.out.println("Moedas em Dólar: " + Valor);
		}

	@Override
	public double converter() {
		return Valor * 5;
	}

	public Dolar(double valor) {
		super(valor);
	}
	
	@Override
	public String toString() {
		return "Moeda: " + nome + ", Valor: " + Valor + ", Valor convertido para real: " + converter();
	}

	@Override
	public double getValor() {
		return converter();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Objects.equals(nome, other.nome);
	}	
}