package br.com.aulas;

import java.util.Scanner;

public class Aula_20_extra {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe um número de 1 a 100:");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0 && numero <= 100) {
			System.out.println("Número par!");
		} else if (numero % 2 != 0 && numero <= 100) {
			System.out.println("Número ímpar!");
		} else {
			System.out.println("Número inválido");
		}
		
	}

}
