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
		System.out.println("Ol�! Por favor, informe Companhia A�rea: ");
		String companhiaAerea = scan.next();
		System.out.println("Informe modelo do Avi�o: ");
		String modelo = scan.next();
		System.out.println("Informe cor do Avi�o: ");
		String cor = scan.next();
		int numerDeLugares = 0;
		try {
		
			System.out.println("Informe n�mero de lugares: ");
			numerDeLugares = scan.nextInt();

		}catch (Exception e) {
			System.err.println("Insira somente n�meros inteiros!");
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
		sb.append("\n***Caracter�sticas Do Avi�o**\n");
		sb.append("Companhia A�rea Respons�vel: " + companhiaAerea);
		sb.append("\nModelo do Avi�o: " + modelo);
		sb.append("\nCor do Avi�o: " + cor);
		sb.append("\nN� de lugares no Avi�o: " + numeroDeLugares);
		return sb.toString();
	}

}
