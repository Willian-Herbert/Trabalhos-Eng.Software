package empresa;

public class Notebook extends Computador{
	double polegadasTela;
	
	public Notebook(int gbMemoria, int numProcessadores, double polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}

	@Override
	double calculaValor() {
		double total = 250*gbMemoria + 500*numProcessadores + 100*polegadasTela;
		return total;
	}

	@Override
	public String toString() {
		return "Notebook [polegadasTela=" + polegadasTela + ", gbMemoria=" + gbMemoria + ", numProcessadores="
				+ numProcessadores + ", Valor=" + calculaValor() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(polegadasTela);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		if (Double.doubleToLongBits(polegadasTela) != Double.doubleToLongBits(other.polegadasTela))
			return false;
		return true;
	}
	
	
	
}
