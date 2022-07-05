package br.com.aulas;

public class Aula_23 {
	
	public static void main(String[] args) {
		
		// Loop Do While
		// Fazer o que tiver entre {} depois ele é executado pelo while se a condicão for verdadeira.
		
		int i = 1;
		int j = 1;
		
		// Ele vai imprimir o 1 e depois vai executar o comando se verdadeiro, neste caso não executou pois i não é menor que 1..
		do {
			System.out.println(i);
			++i;
		} while (i < 1);

		
		// Loop While
		// Ele faz o comando e depois imprimi, neste caso se j menor que 1 imprimi j, mas não aconteceu pois j não é menor que 1
		while ( j < 1) {
			System.out.println(j);
			++j;
		}
		
	}

}
