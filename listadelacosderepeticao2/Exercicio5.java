package listadelacosderepeticao2;

import java.util.Scanner;

/*
 5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero.
  No final, mostre a soma dos números digitados.(DO...WHILE)
 */
public class Exercicio5 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int numero = 1;
		int somaNumerosDigitados = 0;
		
		do {
			try {
				System.out.print("Digite um número: ");
				numero = scan.nextInt();
			}catch (Exception e) {
				System.err.println("Insira somente valores numéricos inteiros!");
				numero = 0;
			}
			somaNumerosDigitados += numero;
		}while(numero != 0);
		
		System.out.println("soma dos números digitados: " + somaNumerosDigitados);
		
		scan.close();
	}

}
