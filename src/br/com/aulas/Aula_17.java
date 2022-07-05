package br.com.aulas;

import java.util.Scanner;

public class Aula_17 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome aqui: ");
		String primeiroNome = entrada.next();
		
		System.out.println("Digite seu sobrenome aqui: ");
		String sobrenome = entrada.next();
		
		System.out.println("Digite sua idade aqui: ");
		int idade = entrada.nextInt();
		
		
		System.out.println("Olá " + primeiroNome + " " + sobrenome + " " + "você tem " + idade +
				 " anos, isso significa que esta na flor da idade, TRINTOU!");
		
		
		
		
	}

}
