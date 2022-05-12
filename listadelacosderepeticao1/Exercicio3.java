package listadelacosderepeticao1;

import java.util.Scanner;

public class Exercicio3 {

	/*
	 3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
°	10-14 infantil
°	15-17 juvenil
°	18-25 adulto

	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0;
		
		try {
			System.out.println("Informe sua idade: ");
			idade = scan.nextInt();
		}catch (Exception e) {
			System.err.println("Insira somente valores inteiros!");
		}
		
		if(idade <= 9)
			System.out.println("Sem categoria");
		else if(idade >= 10 && idade <= 14)
			System.out.println("10-14 infantil");
		else if(idade >= 15 && idade <= 17) {
			System.out.println("15-17 juvenil");
		} else {
			System.out.println("18-25 adulto");
		}
		
		scan.close();
	}

}