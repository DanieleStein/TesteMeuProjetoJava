package br.com.aulas;

public class Aula_15 {
	
	public static void main(String[] args) {
		
		long totalMiliSegundos = System.currentTimeMillis(); // currentTimeMillis trás o total de milisegundos desde 1 de janeiro de 1970 do meridiano de Gremiwch.
		
		long totalSegundos = totalMiliSegundos / 1000; // Transformar milisegundos em segundos
		long segundoAtual = totalSegundos % 60; // Segundo atual, 1 minuto tem 60 segundos. Total de segundos % 60 (mostra o restante dos segundos de 1 minuto, segundo atual).
		
		long totalMinutos = totalSegundos / 60; // Segundos em minutos
		long minutoAtual = totalMinutos % 60; // Minuto atual, pegar o restante dos minutos atuais
		
		long totalHora = totalMinutos / 60; //de minutos para hora
		long horaAtual = totalHora % 24; //sobra do dia que tem 24 horas, o restante.
		
		
		System.out.println(horaAtual - 3 + ":" + minutoAtual + ":" + segundoAtual);
		// Menos 3 para a diferença de horário no Brasil ficar certa. 
		
	}

}
