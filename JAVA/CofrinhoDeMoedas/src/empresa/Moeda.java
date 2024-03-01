package empresa;

public abstract class Moeda extends Cofrinho{

	//Classe mãe dos tipos de moedas, possui uma variável valor que existe em todas as subclasses e abaixo tem seu construtor e o equals.
	//O equals possibilita o programa comparar as informações de entrada para poder remover corretamente, evitando utilizar o valor na memória.
	double Valor;
	
	public Moeda(double valor) {
		Valor = valor;
	}

	public abstract void info();
	
	public abstract double converter();

	public abstract double getValor();

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(Valor) == Double.doubleToLongBits(other.Valor);
	}
}
