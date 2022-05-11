package poo1105.exer1;

import java.util.Scanner;

/*
 1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
  em seguida crie um objeto cliente, defina as instancias deste objeto
   e apresente as informa��es deste objeto no console.
 */

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0;

		System.out.println("Ol�, informe seu nome: ");
		String nome = scan.nextLine();
		try {
			System.out.println(nome + ", Insira sua idade: ");
			idade = scan.nextInt();
		} catch (Exception e) {
			System.err.println("Insira somente n�meros!");
		}
		System.out.println("Agora insira seu telefone: [99999-9999]");
		scan.nextLine();
		String telefone = scan.next();

		Cliente cliente = new Cliente(nome, telefone, idade);

		System.out.println(cliente);
	}

}
