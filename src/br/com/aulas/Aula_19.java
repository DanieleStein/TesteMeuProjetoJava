package br.com.aulas;

import java.util.Scanner;

public class Aula_19 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome? ");
		String nome = entrada.nextLine();
		
		
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();
		
		if(idade < 1) {
			System.out.println("Idade informada não é válida, repita novamente!");
		
		} else if(idade >= 18) {
			System.out.println(nome + " você já é maior de idade!");
		
		} else {
			System.out.println(nome + " você é menor de idade!");
		}
		
	}

}
