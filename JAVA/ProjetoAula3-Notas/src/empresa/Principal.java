package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Nota mario = new Nota();
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(5);
		
		mario.resultado();
		
		mario.setFaltas(10);
		mario.setNota1(2);
		
		mario.resultado();
		
		
		Nota luigi = new Nota(2,5,5);
		
		luigi.resultado();
	}
}