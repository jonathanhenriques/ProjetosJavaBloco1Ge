package listadelacosderepeticao1;

import java.util.Scanner;

public class Exercicio1 {
	/*
	 1-	Façaa um programa que receba três inteiros e diga qual deles é o maior.
	 */
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String... args) {
		int[] valor = new int[3];
		int maiorValor = 0;
		try {
			
			
			for(int i=0;i<3;i++) {
				System.out.print("Insira " + (i+1) + " valor:");
				valor[i] = scan.nextInt();
			}
			
		}catch (Exception e) {
			System.err.println("Somente números inteiros!");
		}
		
		for(int i=0;i<valor.length;i++) {
			if(maiorValor < valor[i]) 
				maiorValor = valor[i];
		}
		
		System.out.println("O maior valor é: " + maiorValor);
	}

}