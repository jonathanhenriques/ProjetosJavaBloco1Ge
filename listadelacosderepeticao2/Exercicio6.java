package listadelacosderepeticao2;

import java.util.Scanner;

/*
 1-	Escrever um programa que receba vários números inteiros no teclado.
  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int acumulador = 0;
		double mediaMultiplosDe3 = 0;
		int contator = 0;
		
		do {
			try {
				System.out.print("Digite um número: ");
				numero = scan.nextInt();
			}catch(Exception e) {
				System.err.println("Insira somente números inteiros!");
				numero = 0;
			}
			if(numero != 0 && numero % 3 == 0) {
				acumulador += numero;
				contator++;
			}
				
			
			
		}while(numero != 0);
		
		mediaMultiplosDe3 = acumulador/contator;
		System.out.println(acumulador);
		System.out.println(contator);
		System.out.println("média dos números múltiplos de 3: " + mediaMultiplosDe3);
		
		scan.close();
	}
	
	

}
