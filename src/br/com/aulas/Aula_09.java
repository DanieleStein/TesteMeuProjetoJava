package br.com.aulas;

public class Aula_09 {
	
	public static void main(String[] args) {
		
		double base, altura, areaRetangulo, x;
		
		x = 1.0;
		base = 9.34;
		altura = 14.54;
		areaRetangulo = (x + base) * altura;  // se não tivesse () ele iria fazer * primeiro, assim ele faz + depois *
		
		System.out.println("A área de um retangulo de base " + base);
		System.out.println("e altura " + altura + ",");
		System.out.println("é " + areaRetangulo);
		
		
	}

}
