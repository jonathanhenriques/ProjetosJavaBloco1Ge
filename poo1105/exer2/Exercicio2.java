package poo1105.exer2;

import java.util.Scanner;

/*
 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto avião, defina as instancias deste objeto
   e apresente as informações deste objeto no console.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá! Por favor, informe Companhia Aérea: ");
		String companhiaAerea = scan.next();
		System.out.println("Informe modelo do Avião: ");
		String modelo = scan.next();
		System.out.println("Informe cor do Avião: ");
		String cor = scan.next();
		System.out.println("Informe número de lugares: ");
		int numerDeLugares = scan.nextInt();
		
		Aviao aviao = new Aviao(companhiaAerea, modelo, cor, numerDeLugares);
		
		System.out.println(aviao);

	}

}
