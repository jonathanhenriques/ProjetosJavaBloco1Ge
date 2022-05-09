package lacos0905;

import java.util.Scanner;

/*
 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
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
				System.err.println("Insira somente n�meros inteiros!");
				break;
			}
			if (numeros[i] % 2 == 0)
				pares++;
			else
				impares++;
		}

		System.out.printf("Pares: %d, e �mpares: %d", pares, impares);
	}

}
