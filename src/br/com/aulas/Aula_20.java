package br.com.aulas;

import java.util.Scanner;

public class Aula_20 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro de 1 a 100:");
		int numero = entrada.nextInt();
		
		System.out.println("Insira uma cor: Preta ou azul");
		String cor = entrada.next();
		
		
		if(numero <= 50 && cor.equals("preta")) {
			System.out.println("Número menor que 50, e cor preta!");
		} else if (numero < 100 || cor.equals("azul")) {
			System.out.println("Número maior que 50, ou cor azul!");
		} else {
			System.out.println("Opção inválida, insira novamente!");
		}
			
		
	}

}
