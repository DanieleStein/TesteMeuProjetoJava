package br.com.aulas;

import java.util.Scanner;

public class Aula_21 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Ano bissexto: se o ano for múltiplo de 400. múltiplo de 4. E não múltiplos de 100.
		
		System.out.println("Insira um ano:");
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano " + ano + " Bissexto!");
		} else {
			System.out.println("Ano "+ ano + " não é bissexto!");
		}
	}

}
