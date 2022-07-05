package br.com.aulas;

import java.util.Scanner;

public class Aula_11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double base, altura, areaRetangulo;
		
		System.out.println("Informe o valor da base: ");
		base = entrada.nextDouble();                     // esse comando é para o usuario escrever o valor
		
		System.out.println("Informe o valor da altura: ");
		altura = entrada.nextDouble();                   // esse comando é para o usuario escrever o valor
		
				
		areaRetangulo = base * altura;
		
		System.out.println("A área de um retangulo de base " + base);
		System.out.println("e altura " + altura + ",");
		System.out.println("é " + areaRetangulo);
		
	}

}
