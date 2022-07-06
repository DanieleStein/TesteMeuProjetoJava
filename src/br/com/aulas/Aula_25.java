package br.com.aulas;

import java.util.Random;
import java.util.Scanner;

public class Aula_25 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		
		boolean acertou = false;
		int tentativas = 10;                  //tentativas que o usuario tera de acertar o numero
		int numeroSecreto = random.nextInt(); //numero aleatorio que vai ser gerado pelo sistema
		long chute = 0;
		
		// quando tentativas ainda for maior que 0, usuario continuára chutando, e enquanto acertou for falso, ele vai continuar chutando o numero.
		
		System.out.println(numeroSecreto);
		while (tentativas > 0 && acertou == false) {
			System.out.println("Qual seu palpite? ");
			chute = entrada.nextLong();             // numeros que o usuario esta usando
			
			if (numeroSecreto == chute) {
			System.out.println("Parábens, você acertou!");
			acertou = true;                         // mudando o bollean para true, assim que o usuario acertar, ele vai fazer o ciclo parar
			} else if (chute < numeroSecreto) {
				--tentativas;						//diminuindo 1 tentativa
				System.out.println("Número muito pequeno! " + tentativas + " tentativas restantes!");
			} else {
				System.out.println("Número muito grande! " + tentativas + " tentativas restantes!");
			}
		}
			
		
		
	}

}
