package listadelacosderepeticao2;

import java.util.Scanner;

/*
 1-	Escrever um programa que receba v�rios n�meros inteiros no teclado.
  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
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
				System.out.print("Digite um n�mero: ");
				numero = scan.nextInt();
			}catch(Exception e) {
				System.err.println("Insira somente n�meros inteiros!");
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
		System.out.println("m�dia dos n�meros m�ltiplos de 3: " + mediaMultiplosDe3);
		
		scan.close();
	}
	
	

}
