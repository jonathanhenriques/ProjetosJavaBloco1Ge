package lacos0905;

import java.util.Scanner;

/*
 5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
  No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
public class Exercicio5 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int numero = 1;
		int somaNumerosDigitados = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = scan.nextInt();
			somaNumerosDigitados += numero;
		}while(numero != 0);
		
		System.out.println("soma dos n�meros digitados: " + somaNumerosDigitados);
		
		scan.close();
	}

}
