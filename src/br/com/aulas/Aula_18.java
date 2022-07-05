package br.com.aulas;

import java.util.Scanner;

public class Aula_18 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome? ");
		String nome = entrada.nextLine();
		
		
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você já é maior de idade!");
		}
		
	}

}
