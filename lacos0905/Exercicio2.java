package lacos0905;

import java.util.Scanner;

/*
 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println("Insira um valor: ");
				numeros[i] = scan.nextInt();
			}catch (Exception e) {
				System.err.println("Insira somente números inteiros!");
				break;
			}
			if (numeros[i] % 2 == 0)
				pares++;
			else
				impares++;
		}

		System.out.printf("Pares: %d, e Ímpares: %d", pares, impares);
	}

}
