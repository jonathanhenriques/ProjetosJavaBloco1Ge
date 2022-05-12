package listadelacosderepeticao1;

import java.util.Scanner;

public class Exercicio2 {

	/*
	 * 1- Façaa um programa que entre com três números e coloque em ordem crescente.
	 */

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int[] valor = new int[3];

		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Insira " + (i + 1) + "° valor:");
				valor[i] = scan.nextInt();
			}
		}catch (Exception e) {
			System.err.println("Insira somente números inteiros!");
		}

		int guarda = 0;
		for (int i = 0; i < valor.length; i++) {
			for (int j = i; j < i+1; j++) {
				if (valor[i] > valor[j]) {
					guarda = valor[j];
					valor[j] = valor[i];
					valor[i] = guarda;
				}
			}
		}

		for (int i = 0; i < valor.length; i++) {
			System.out.println(valor[i]);
		}
		
		scan.close();

	}

}
