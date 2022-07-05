package br.com.aulas;

import java.util.Scanner;

public class Aula_14 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor em gramas: ");
		int gramas = entrada.nextInt();
		
		int kilos = gramas / 1000; //sei que 1 kg tem 1000 gramas, entao gramas / por 1000 vai dar o valor em kg
		gramas = gramas % 1000; // 
		
		System.out.println("Total de kilos é: " + kilos);
		System.out.println("Total de gramas é: " + gramas);
		
		
		
	}

}
