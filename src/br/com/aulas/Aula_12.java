package br.com.aulas;

public class Aula_12 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 6; int z = 3;
		double a = 3; double b = 1.0;
		double c = (double)x / y;
		int h = (int)c;
		//Quando faço um calculo de dois números int, mesmo dizendo que o resultado é double, ele vai me dar em int
		//Colocando o double na frente de x, a gente força ele a ser double, e o resultado será em double
		//quero colocar o resultado de c(double) dentro do h que é(int) ele da erro, porém se usar o (int) entes do c, ele vai transformar.
		
		
		System.out.println("x = " + h);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
	}

}
