package poo1105.exer2;

import java.util.Scanner;

public class Aviao {
	private String companhiaAerea;
	private String modelo;
	private String cor;
	private int numeroDeLugares;

	static Scanner scan = new Scanner(System.in);

	public Aviao(String companhiaAerea, String modelo, String cor, int numeroDeLugares) {
		this.companhiaAerea = companhiaAerea;
		this.modelo = modelo;
		this.cor = cor;
		this.numeroDeLugares = numeroDeLugares;
	}

	public static Aviao descricaoDoAviao() {
		System.out.println("Olá! Por favor, informe Companhia Aérea: ");
		String companhiaAerea = scan.next();
		System.out.println("Informe modelo do Avião: ");
		String modelo = scan.next();
		System.out.println("Informe cor do Avião: ");
		String cor = scan.next();
		int numerDeLugares = 0;
		try {
		
			System.out.println("Informe número de lugares: ");
			numerDeLugares = scan.nextInt();

		}catch (Exception e) {
			System.err.println("Insira somente números inteiros!");
		}
		
		Aviao aviao = new Aviao(companhiaAerea, modelo, cor, numerDeLugares);
		return aviao;
	}

	public void informacaoesDoAviao() {
		this.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***Características Do Avião**\n");
		sb.append("Companhia Aérea Responsável: " + companhiaAerea);
		sb.append("\nModelo do Avião: " + modelo);
		sb.append("\nCor do Avião: " + cor);
		sb.append("\nN° de lugares no Avião: " + numeroDeLugares);
		return sb.toString();
	}

}
