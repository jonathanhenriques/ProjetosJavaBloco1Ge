package poo1105.exer2;

import java.util.Scanner;

/*
 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
  em seguida crie um objeto avi�o, defina as instancias deste objeto
   e apresente as informa��es deste objeto no console.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ol�! Por favor, informe Companhia A�rea: ");
		String companhiaAerea = scan.next();
		System.out.println("Informe modelo do Avi�o: ");
		String modelo = scan.next();
		System.out.println("Informe cor do Avi�o: ");
		String cor = scan.next();
		System.out.println("Informe n�mero de lugares: ");
		int numerDeLugares = scan.nextInt();
		
		Aviao aviao = new Aviao(companhiaAerea, modelo, cor, numerDeLugares);
		
		System.out.println(aviao);

	}

}
