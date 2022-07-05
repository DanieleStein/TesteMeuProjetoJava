package br.com.aulas;

import java.util.Scanner;

public class Aula_13 {
	
	public static void main(String[] args) {
		
		final double PI = 3.141592; // Uma var final, é uma var constante, que não muda o valor
		Scanner entrada = new Scanner(System.in); //entrada é o nome que nos damos. Depois de informado o comando apertar na bolinha vermelha para puxar o scannner la em cima.

		
		System.out.println("Informe o valor do raio: ");
		double raio = entrada.nextDouble(); // aqui vai puxar a informação do usuario, quando o valor é double, quando colocamos entrada.(tem que puxar o valor com double).
		
		double area = raio * raio * PI;
				
		
		System.out.println("O valor da área é: " + area);
		
		
	}

}
