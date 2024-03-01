package empresa;

import java.util.Objects;

public class Real extends Moeda{

	//Classe filha da classe moeda, possui uma variável com seu nome para diferenciação. Abaixo tem o método info que possui as informações da classe.
	//O método converter, pega o valor da moeda adicionada e converte para o valor em real
	//O toString faz uma definição de como deve ser a apresentação do objeto na lista e o equals faz a comparação para quando precisar remover o objeto da lista.
	String nome = "Real";
	
	@Override
	public void info() {
		System.out.println(nome);
		System.out.println("Moedas em Real: " + Valor);
		}

	@Override
	public double converter() {
		return Valor;
	}
	
	public Real(double valor) {
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
		Real other = (Real) obj;
		return Objects.equals(nome, other.nome);
	}	
}
