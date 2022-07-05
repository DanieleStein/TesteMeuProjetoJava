package br.com.aulas;

import java.util.Scanner;

public class Aula_16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		int x = entrada.nextInt();
		
		
		
		System.out.println(x++); //pos-incremento
		System.out.println(++x); //pre-incremento
		System.out.println(x--); //pos-decremento
		System.out.println(--x); //pre-decremento
		System.out.println(x += 5); // esse cálculo é a mesma coisa que x = x + 5
		System.out.println(x -= 5);
		System.out.println(x *= 5);
		System.out.println(x /= 5);
		System.out.println(x %= 5);
		
		
		
	}

}
