package empresa;

public abstract class Computador {
	int gbMemoria;
	int numProcessadores;

	public Computador(int gbMemoria, int numProcessadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gbMemoria;
		result = prime * result + numProcessadores;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (gbMemoria != other.gbMemoria)
			return false;
		if (numProcessadores != other.numProcessadores)
			return false;
		return true;
	}




	abstract double calculaValor();
}
